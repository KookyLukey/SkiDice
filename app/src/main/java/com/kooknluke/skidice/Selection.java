package com.kooknluke.skidice;

import java.util.Random;

public class Selection {

	boolean switchCounter = false;
	boolean switchOr = false;

	public String[] switchSelect = { "Switch ", "" };

	public String[] jumpSpinsArr = {

	"180 ", "360 ", "540 ", "720 ", "900 ", "1080 ", "1260 ", "1440 ", "1620 "

	};

	public String[] jumpTricksArr = {

	"", "Rodeo ", "Misty ", "Under Flip ", "Cork ", "Bio ", "Double Cork ",
			"Double Rodeo ", "Triple Cork "

	};

	public String[] proJumpTricksArr = {

	"Double Cork ", "Double Rodeo ", "Triple Cork ", "Kangaroo Flip "

	};

	public String[] rodeoSpinArr = {

	"540 ", "720 ", "900 ", "1080 ", "1260 ", "1440 ", "1620 "

	};

	public String[] dubSpinArr = {

	"720 ", "900 ", "1080 ", "1260 ", "1440 ", "1620 "

	};

	public String[] tripSpinArr = {

	"1080 ", "1260 ", "1440 ", "1620 "

	};

	public String[] corkSpinsArr = {

	"360 ", "540 ", "720 ", "900 ", "1080 "

	};

	public String[] grabsArr = {

	" ", "Pick a grab! ", "Safety ", "Mute ", "Japan ", "Blunt ", "Octo "

	};

	public String[] railSpinsArr = {

	"Ride ", "270 ", "450 ", "630 ", "900 "

	};

	public String[] railTricksArr = {

	"FS Swap ", "BS Swap ", "FS Surface Swap ", "BS Surface Swap ",
			"FS 360 Swap ", "BS 360 Swap "

	};

	public String[] FSBS = {

	"FS ", "BS "

	};

	public String switchSelector() {

		String switchS = "";

		// Randomly select switch or regular
		Random randomGenerator = new Random(); // Construct a new Random number
												// generator
		int randomNumber = randomGenerator.nextInt(switchSelect.length);

		switchS = switchSelect[randomNumber];

		return switchS;
	}

	public String easyJumps() {

		String easyJ = "";

		// Randomly select switch or regular
		Random randomGenerator = new Random(); // Construct a new Random number
												// generator
		int randomNumber = randomGenerator.nextInt(3);
		int randomNumber2 = randomGenerator.nextInt(3);

		easyJ = jumpSpinsArr[randomNumber] + grabsArr[randomNumber2];

		return easyJ;

	}

	public String medJumps() {

		String medJ = "";

		Random randomGenerator = new Random();

		int randSpin = randomGenerator.nextInt(4);
		int randTrick = randomGenerator.nextInt(3);
		int randGrab = randomGenerator.nextInt(4);

		if (randTrick == 1 || randTrick == 2 || randTrick == 3) {

			medJ = jumpTricksArr[randTrick] + rodeoSpinArr[0]
					+ grabsArr[randGrab];

		} else

			medJ = jumpTricksArr[randTrick] + jumpSpinsArr[randSpin]
					+ grabsArr[randGrab];

		return medJ;
	};

	public String hardJumps() {

		String hardJ = "";

		Random randomGenerator = new Random();

		int randSpin = randomGenerator.nextInt(6);
		int rodeoSpin = randomGenerator.nextInt(3);
		int corkSpin = randomGenerator.nextInt(4);
		int randTrick = randomGenerator.nextInt(6);
		int randGrab = randomGenerator.nextInt(6);

		if (randTrick == 1 || randTrick == 2 || randTrick == 3
				|| randTrick == 5) {
			hardJ = jumpTricksArr[randTrick] + rodeoSpinArr[rodeoSpin]
					+ grabsArr[randGrab];
		} else if (randTrick == 4) {

			hardJ = jumpTricksArr[randTrick] + corkSpinsArr[corkSpin]
					+ grabsArr[randGrab];

		} else

			hardJ = jumpTricksArr[randTrick] + jumpSpinsArr[randSpin]
					+ grabsArr[randGrab];

		return hardJ;
	}

	public String proJumps() {

		String proJ = "";

		Random randomGenerator = new Random();

		int dubSpin = randomGenerator.nextInt(6);
		int tripSpin = randomGenerator.nextInt(4);
		int randTrick = randomGenerator.nextInt(4);
		int randGrab = randomGenerator.nextInt(7);
		int switchSel = randomGenerator.nextInt(2);

		
//				if (randTrick == 0 || randTrick == 1) {
//					
//					proJ = switchSelect[1] + proJumpTricksArr[randTrick]
//							+ dubSpinArr[dubSpin] + grabsArr[randGrab];
//
//				} else if (randTrick == 3) {
//					
//					proJ = switchSelect[1] + proJumpTricksArr[randTrick]
//							+ grabsArr[randGrab];
//
//				} else {
//					
//					proJ = switchSelect[1] + proJumpTricksArr[randTrick]
//							+ tripSpinArr[tripSpin] + grabsArr[randGrab];
//			
//		}


		if (randTrick == 0 || randTrick == 1) {

			proJ = switchSelect[switchSel] + proJumpTricksArr[randTrick]
					+ dubSpinArr[dubSpin] + grabsArr[randGrab];

		} else if (randTrick == 3) {

			proJ = switchSelect[switchSel] + proJumpTricksArr[randTrick]
					+ grabsArr[randGrab];

		} else

			proJ = switchSelect[switchSel] + proJumpTricksArr[randTrick]
					+ tripSpinArr[tripSpin] + grabsArr[randGrab];

		return proJ;
	}

	public String easyRails() {

		String easyR = "";

		easyR = "Side Jump";

		return easyR;
	}

	public String medRails() {

		String medR = "";

		Random randomGenerator = new Random();

		int switches = randomGenerator.nextInt(2);
		int randOff = randomGenerator.nextInt(2);
		int randOn = randomGenerator.nextInt(2);
		int FoB = randomGenerator.nextInt(2);

		if (randOff == 0) {
			medR = railSpinsArr[randOn] + "on "
					+ railSpinsArr[randOff] + "off";
		} else {
			medR = railSpinsArr[randOn] + "on "
					+ FSBS[FoB] + railSpinsArr[randOff] + "off";
		}

		return medR;
	}

	public String hardRails() {

		String hardR = "";

		Random randomGenerator = new Random();

		int switches = randomGenerator.nextInt(2);
		int randOff = randomGenerator.nextInt(3);
		int randOn = randomGenerator.nextInt(2);
		int FoB = randomGenerator.nextInt(2);
		int randSwap = randomGenerator.nextInt(2);

		if (randOff == 0) {
			hardR = railSpinsArr[randOn] + "on "
					+ railTricksArr[randSwap] + railSpinsArr[randOff] + "off";
		} else {
			hardR = railSpinsArr[randOn] + "on "
					+ railTricksArr[randSwap] + FSBS[FoB]
					+ railSpinsArr[randOff] + "off";
		}

		return hardR;

	}

	public String proRails() {

		String proR = "";

		Random randomGenerator = new Random();

		int switches = randomGenerator.nextInt(2);
		int randOff = randomGenerator.nextInt(5);
		int randOn = randomGenerator.nextInt(4);
		int FoB = randomGenerator.nextInt(2);
		int randSwap = randomGenerator.nextInt(6);

		if (randOff == 0) {
			proR = switchSelect[switches] + railSpinsArr[randOn] + "on "
					+ railTricksArr[randSwap] + railSpinsArr[randOff] + "off";
		} else {
			proR = switchSelect[switches] + railSpinsArr[randOn] + "on "
					+ railTricksArr[randSwap] + FSBS[FoB]
					+ railSpinsArr[randOff] + "off";
		}

		return proR;

	}

	public String mApres() {

		String finalApres = "";

		Random randomGenerator = new Random();

		int pickUp = randomGenerator.nextInt(15);
		finalApres = apresArr[pickUp];

		return finalApres;
	}

	public String[] apresArr = {
			"Girl are you Medusa because I'm rock hard",
			"Wanna come back to my place and watch porn on my 60 inch ... mirror",
			"I'm going for outside for some air, mind holding this for me? (hold out your hand)",
			"Hey girl, are you my appendix, because I don't know how you work, but something in the pit of my stomach is telling me to take you out.",
			"Are you the SAT? Because I'd do you for 3 hours and 45 minutes.",
			"On a scale of 1 to America, how free are you tonight?",
			"Damn girl, you shit with that ass?",
			"What's up, ladies? My name's Slim Shady. I'm the lead singer in D12 baby.",
			"Say baby. You're pretty, I'm pretty, what say we go back to my place and stare at each other for a while.",
			"Hey Baby, my love is a tidal wave and you're beach front property.",
			"Do you know how I got these guns? (Point to biceps while flexing) Lifting children out of poverty.",
			"Do you want to go halfsies on a bastard child?",
			"When I was born I had 2 choices: One was to have perfect memory and the other was to have a huge penis. Unfortunately I can't remember which one i chose.",
			"There's a big sale in my bedroom right now. Clothes are 100% off!",
			"What has 206 teeth and holds back the incredible hulk? ... My zipper." };

}
