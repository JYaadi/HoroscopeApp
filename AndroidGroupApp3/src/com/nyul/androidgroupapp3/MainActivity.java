package com.nyul.androidgroupapp3;

import static java.lang.Thread.sleep;
import android.os.Looper;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import com.nyul.androidgroupapp3.dialogue.DialogueMaker;
import com.nyul.androidgroupapp3.dialogue.SelectionListener;


public class MainActivity extends ParentActivity{
	DialogueMaker dialogueMaker = new DialogueMaker(this);	

	protected void onClickButton1(View v) {
		final String[] items = { "22nd June-22nd July", 
				"Meaning of Name: The Crab",
				"Lucky Day: Monday, Thursday", 
				"Lucky Numbers: 2, 7, 11, 16, 20, 25",
				" Lucky Colors: Orange, white",
				" Lucky Stones: Pearl, Moon Stone, Ruby",
				"Lucky Talisman: Sea Shells",
				"Ruling planet: Moon",
		        "Element: Water"};
		dialogueMaker.options("Cancer", items);
	}

	protected void onClickButton2(View v) {
		final String[] items = { "23rd July-22nd August",
				"Meaning of Name: The Lion",
				"Lucky Day: Sunday",
				"Lucky Numbers: 1, 4, 10, 13, 19, 22",
				"Lucky Colours: Gold, Orange, White, Red",
				"Lucky Stones: Sardonynx, Diamond, Amber, Ruby",
				"Lucky Talisman: Heart and the Ladybird in Metal Gold",
				"Ruling Planet: Sun",
		        "Element: Fire" }; 
		dialogueMaker.options("Leo", items);
	}



	protected void onClickButton3(View v) {
		final String[] items = {"23rd August-22nd September",
				"Meaning of Name: The Maiden",
				"Lucky Day: Wednesday",
				"Lucky Numbers: 5, 14, 23, 32, 41, 50",
				"Lucky Colours: Orange, White, Grey, Yellow",
				"Lucky Stone: Topaz",
				"Lucky Talisman: The Key, The Owl, The Tau, The Bamboo and Serpent",
				"Ruling Planet: Mercury",
		        "Element: Earth"}; 
		dialogueMaker.options("Virgo", items);
	} 



	protected void onClickButton4(View v) {
		final String[] items = {"23rd September-23rd October",
				"Meaning of Name: The Scales",
				"Lucky Day: Friday",
				"Lucky Numbers: 6, 15, 24, 33, 42, 51, 60",
				"Lucky Colours: Blue, Green",
				"Lucky Stones: Sapphire and Turquoise",
				"Lucky Talisman: Copper",
				"Ruling Planet: Venus",
		        "Element: Air"};
		dialogueMaker.options("Libra", items);
	}
	
	
	protected void onClickButton5(View v) {
		final String[] items = {"24rd October-22nd November",
				"Meaning of Name: The Scorpion",
				"Lucky Day; Tuesday",
				"Lucky Numbers: 9, 18, 27, 36, 45, 54, 63, 72, 81, 90",
				"Lucky Colour: Red",
				"Lucky Stone: Bloodstone",
			    "Lucky Talisman: Gold Initial",
                "Ruling Planets: Pluto and Mars",
                "Element: Water"};
          dialogueMaker.options("Scorpio", items);
	}
	
	
	protected void onClickButton6(View v) {
		final String[] items = {"23rd November-21st December",
				"Meaning of Name: The Archer",
				"Lucky Day: Thursday",
				"Lucky Numbers: 3, 12, 21, 30",
				"Lucky Colours: Violet, Purple, Red, Pink",
				"Lucky Stones: Amethyst and Topaz",
				"Lucky Talisman: Tin, Flint, Arrowheads and Cornucopia",
				"Ruling Planet: Jupiter",
				"Element: Fire"};
		    dialogueMaker.options("Sagitarrius", items);
	}
	
	
	protected void onClickButton7(View v) {
		final String[] items = {"22nd December-20th January",
				"Meaning of Name : The Goat",
				"Lucky Day : Saturday",
				"Lucky Numbers : 1, 4, 8, 10, 13, 17, 19, 22, 26",
				"Lucky Colours : Brown, Sliver, Grey, Black",
				"Lucky Stone : Dark Sapphire",
				"Lucky Talisman : The Plough",
				"Ruling Planet : Saturn",
				"Element: Earth",};
				dialogueMaker.options("Capricorn", items);
				
		}
	
	
	protected void onClickButton8(View v) {
		final String[] items = {"21st January-18th February",
				"Meaning of Name: The Water-bearer",
				"Lucky Numbers : 4, 8, 13, 17, 22, 26",
				"Lucky Colours : Blue, Blue-green, Grey, Black",
				"Lucky Stones : Opal and Aquamarine",
				"Lucky Talisman : The Key (lead) and the Owl",
				"Ruling Planet : Uranus and Saturn. ",
				"Element: Air",};
		dialogueMaker.options("Aquarius", items);
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
				
		class SelectedOptionsHandler implements Runnable{
		private final SelectionListener listener;
		private final TextView textView = (TextView) findViewById(R.id.textView1);

		public SelectedOptionsHandler(SelectionListener listener) {
			this.listener = listener;
		}

		@Override
		public void run() {
			for(final String s : listener.getCheckedOptionsList()){	
				textView.setText(s);
			}
		}

	}

	class MultiOptionsHandler implements Runnable{
		private final SelectionListener listener;
		private final TextView tV = (TextView) findViewById(R.id.textView1);				

		public MultiOptionsHandler(SelectionListener listener) {
			this.listener = listener; 
		}

		@Override
		public void run() {
			Looper.prepare();
			while( ! listener.wasOkPressed() ){
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					log(e.toString());
				}
			}

			tV.post(new SelectedOptionsHandler(listener));			
		}

	}

}