package shuffle;

import java.util.*;

public class Card {
	public static enum Face{红心, 方块, 草花, 黑桃};

	public static enum Deck{ one, two, three, four, five, six, seven, eight,
			nine, ten, eleven, tweleve, thirteen };
	
	/**
	 * 
	 * 私有变量将从枚举Face, Deck中获得值，那么其返回值应该定义成枚举（enum)吗？
	 * 是的，但是需要使用Face face, Deck deck;
	 *
	 */
	private Face face;  
	private Deck deck;
			
	public Card(Face faceVal, Deck deckVal)  //和上面解释一样，类型就用枚举的名称
	{
		face = faceVal;
		deck = deckVal;
	}
	
	public String toString()
	{
		return String.format("%s of %s", deck, face);
	}
	
	public static void main(String argc[])
	{
		Card card[] = new Card[52];
		int counter = 0;
		
		for ( Card.Face faceVal : Card.Face.values())
		{
			for (Card.Deck deckVal :Card.Deck.values() )
			{
				card[counter++] = new Card(faceVal, deckVal);
			}
		}
							
		List <Card> list = Arrays.asList(card); // 将数组转化成collection
							
		Collections.shuffle(list);   //利用集合（collections）的静态方法，打乱list集合顺序
		Card[] card2 = new Card[52]; //创建新数组
		list.toArray(card2);		 //将collection转换成数组，以便输出
		
		int x =1;
		 
		 for (Card c : card2)
		 {
			 System.out.println(c +" "+ (x++) );
		 }
			
	}
	
	
	
}
