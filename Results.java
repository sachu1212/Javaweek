class Results{public static void main (String xyz[]){
				int physics, chemistry, math, total;
				float Percentage;
				physics=83;
				chemistry=130;
				math=60;
				total=physics+chemistry+math;
				Percentage=total*100/450;
				System.out.println("Total Marks Scored :"+total);
				System.out.println("Percentage :"+Percentage);
				if (Percentage>=60){System.out.println("You have passed the exam");}
				if (Percentage<60){System.out.println("You have failed");}
}}