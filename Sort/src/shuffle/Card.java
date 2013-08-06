package shuffle;

import java.util.*;

public class Card {
	public static enum Face{����, ����, �ݻ�, ����};

	public static enum Deck{ one, two, three, four, five, six, seven, eight,
			nine, ten, eleven, tweleve, thirteen };
	
	/**
	 * 
	 * ˽�б�������ö��Face, Deck�л��ֵ����ô�䷵��ֵӦ�ö����ö�٣�enum)��
	 * �ǵģ�������Ҫʹ��Face face, Deck deck;
	 *
	 */
	private Face face;  
	private Deck deck;
			
	public Card(Face faceVal, Deck deckVal)  //���������һ�������;���ö�ٵ�����
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
							
		List <Card> list = Arrays.asList(card); // ������ת����collection
							
		Collections.shuffle(list);   //���ü��ϣ�collections���ľ�̬����������list����˳��
		Card[] card2 = new Card[52]; //����������
		list.toArray(card2);		 //��collectionת�������飬�Ա����
		
		int x =1;
		 
		 for (Card c : card2)
		 {
			 System.out.println(c +" "+ (x++) );
		 }
			
	}
	
	
	
}
