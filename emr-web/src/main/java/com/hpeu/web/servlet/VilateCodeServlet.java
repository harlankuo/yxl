package com.hpeu.web.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 生成验证码Servlet
 * 
 * @title VilateCodeServlet.java
 * @author 姚臣伟
 * @company 慧与（中国）
 * @date 2019年10月12日
 */
@WebServlet("/vcode")
public class VilateCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 6812958377338005368L;

	private static final int WIDTH = 95;//定义图片的width
    private static final int HEIGHT = 30;//定义图片的height
    private static final int CODECOUNT = 4;//定义图片上显示验证码的个数
    private static final int CHARACTERSPACING = 10; // 字符间隔
    private static final int FONTHEIGHT = 24; // 字体大小
    private static final int LINENUMBER = 20; // 干扰线
    private static final int VERTICALPOSITION = 24; // 字符垂直位置
    private static final char[] CODESEQUENCE = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J',
            'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z', '2', '3', '4', '5', '6', '7', '8', '9' };
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedImage buffImg = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics gd = buffImg.getGraphics();
        Random random = new Random();
        gd.setColor(Color.WHITE);
        gd.fillRect(0, 0, WIDTH, HEIGHT);
        Font font = new Font("Arial", Font.BOLD, FONTHEIGHT);
        gd.setFont(font);
        gd.setColor(Color.BLACK);
        gd.drawRect(0, 0, WIDTH - 1, HEIGHT - 1);
        // 设置干扰线颜色
        gd.setColor(Color.DARK_GRAY);
        // 干扰线
        for (int i = 0; i < LINENUMBER; i++) {
            int startX = random.nextInt(WIDTH);
            int startY = random.nextInt(HEIGHT);
            int endX = random.nextInt(VERTICALPOSITION);
            int endY = random.nextInt(VERTICALPOSITION);
            gd.drawLine(startX, startY, startX + endX, startY + endY);
        }
        // 生成验证码
        StringBuffer randomCode = new StringBuffer();
        for (int i = 0; i < CODECOUNT; i++) {
        	// 获取一位验证码字符
            String code = String.valueOf(CODESEQUENCE[random.nextInt(CODESEQUENCE.length)]);
            // 设置颜色
            gd.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            // 绘制验证码
            gd.drawString(code, CHARACTERSPACING + i * 2 * CHARACTERSPACING, VERTICALPOSITION);
            randomCode.append(code);
        }
        
        // 把生成的验证码字符串存放到Session对象中
        HttpSession session = request.getSession();
        session.setAttribute("vcode", randomCode.toString());
        
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/png");
        ImageIO.write(buffImg, "png", response.getOutputStream());
	}
}







