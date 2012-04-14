package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class MyCardOptions implements ScreenState {

	private static final long serialVersionUID = 1L;
	/***************************************
	 * SCREEN:MY CARD OPTIONS AUTHOR:Madhumita V
	 * 
	 * Modified by RENIS SHAH
	 ***************************************/

	/* Loading image and Fonts */
	PImage CardImage, MyHome, Payments, MyRewards, Stores, Settings;
	PFont f, f1;

	/* Modified by RENISH */

	AppController appController;

	public MyCardOptions(AppController appController) {
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		CardImage = applet.loadImage("StarbucksSpecialEditionCard.jpg");
		f = applet.loadFont("Calibri-Bold-30.vlw");
		f1 = applet.loadFont("Calibri-30.vlw");

		/* Creating the main boundary */
		applet.size(262, 400);
		applet.background(50);
		applet.line(2, 2, 260, 2);
		applet.line(2, 2, 2, 398);
		applet.line(2, 398, 260, 398);
		applet.line(260, 2, 260, 398);

		/* Creating the option heading and subheading */
		applet.fill(27, 131, 87);
		applet.rect(0, 0, 265, 47);
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("My Cards", 85, 30);

		applet.fill(21, 67, 54);
		applet.rect(180, 5, 75, 35, 8, 8, 8, 8);
		applet.fill(255);
		applet.textFont(f, 15);
		applet.text("Add New", 190, 27);

		/* Creating the common menu behind transparent screen */
		applet.line(2, 350, 260, 350);
		applet.line(52, 350, 52, 398);
		applet.line(104, 350, 104, 398);
		applet.line(159, 350, 159, 398);
		applet.line(208, 350, 208, 398);
		applet.textFont(f1, 11);
		// 1. Home
		applet.fill(80);
		applet.rect(3, 352, 50, 45);
		MyHome = applet.loadImage("MyHome.png"); // Image of MyHome
		applet.image(MyHome, 8, 355, 40, 25);

		applet.fill(255);
		applet.text("Cards", 15, 395); // Text for MyHome

		// 2. Payments
		applet.fill(80);
		applet.rect(55, 352, 50, 45);
		Payments = applet.loadImage("Payments.png"); // Image of Payments
		applet.image(Payments, 60, 355, 40, 25);

		applet.fill(255);
		applet.text("Payments", 60, 395); // Text for Payments

		// 3. My Rewards
		applet.fill(80);
		applet.rect(108, 352, 50, 45);
		MyRewards = applet.loadImage("MyRewards.png"); // Image of My Rewards
		applet.image(MyRewards, 113, 355, 40, 25);

		applet.fill(255);
		applet.text("My Rewards", 108, 395); // Text for MyRewards

		// 4. Stores
		applet.fill(80);
		applet.rect(160, 352, 50, 45);
		Stores = applet.loadImage("Stores.png"); // Image of Stores
		applet.image(Stores, 165, 355, 40, 25);

		applet.fill(255);
		applet.text("Stores", 173, 395); // Text for Stores

		// 5. Settings
		applet.fill(80);
		applet.rect(212, 352, 50, 45);
		Settings = applet.loadImage("Settings.png"); // Image of Settings
		applet.image(Settings, 217, 355, 40, 25);

		applet.fill(255);
		applet.text("Settings", 220, 395); // Text for Settings

		/* Drawing starbucks card image to screen co-ordinates */
		applet.image(CardImage, 30, 65, 200, 125);

		/* Creating options tabs */
		applet.fill(150, 152, 155, 220);
		applet.tint(0, 153, 204, 126); // Transparent screen
		applet.rect(0, 180, 265, 398);

		applet.fill(212, 212, 214);
		applet.rect(30, 195, 205, 35, 8, 8, 8, 8);
		applet.fill(0);
		applet.textFont(f, 20);
		applet.text("Reload Card", 80, 218);

		applet.fill(212, 212, 214);
		applet.rect(30, 240, 205, 35, 8, 8, 8, 8);
		applet.fill(0);
		applet.textFont(f, 20);
		applet.text("Refresh Balance", 72, 265);

		applet.fill(212, 212, 214);
		applet.rect(30, 285, 205, 35, 8, 8, 8, 8);
		applet.fill(0);
		applet.textFont(f, 20);
		applet.text("More Options", 76, 310);

		applet.fill(73, 74, 75);
		applet.rect(30, 345, 205, 35, 8, 8, 8, 8);
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("Cancel", 105, 368);

	}

	@Override
	public void mousePressed(PApplet applet) {
		if (applet.mouseX > 30 - 205 && applet.mouseX < 30 + 205
				&& applet.mouseY > 195 - 35 && applet.mouseY < 195 + 35) {
			// When Button Reload Card is pressed
			applet.fill(250, 255, 155, 220);
			applet.rect(30, 195, 205, 35, 8, 8, 8, 8);
		}

		else if (applet.mouseX > 30 - 205 && applet.mouseX < 30 + 205
				&& applet.mouseY > 240 - 35 && applet.mouseY < 240 + 35) {
			// When Button Refresh Balance is pressed
			applet.fill(250, 255, 155, 220);
			applet.rect(30, 240, 205, 35, 8, 8, 8, 8);

		} else if (applet.mouseX > 30 - 205 && applet.mouseX < 30 + 205
				&& applet.mouseY > 285 - 35 && applet.mouseY < 285 + 35) {
			// When Button More Options is pressed
			applet.fill(250, 255, 155, 220);
			applet.rect(30, 285, 205, 35, 8, 8, 8, 8);

			appController.setCurrentScreen(appController
					.getMyCardsMoreOptions());

		} else if (applet.mouseX > 30 - 205 && applet.mouseX < 30 + 205
				&& applet.mouseY > 345 - 35 && applet.mouseY < 345 + 35) {
			// When Button Cancel is pressed
			applet.fill(250, 255, 155, 220);
			applet.rect(30, 345, 205, 35, 8, 8, 8, 8);
		} else if (applet.mouseX > 180 - 75 && applet.mouseX < 180 + 75
				&& applet.mouseY > 5 - 35 && applet.mouseY < 5 + 35) {
			// When Button Add New is pressed
			applet.fill(250, 255, 155, 220);
			applet.rect(180, 5, 75, 35, 8, 8, 8, 8);
		}

	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}

}
