package lab7;

public class Main {
    public static void main(String[] args) {

        NovelComponentIF book_one = new Novel("Design Pattern");
        String input = "Design an archive system to store novels. A novel can have many pages. Within a page, there can be several columns and frames. A column can contain frames, so can a frame contain columns. Moreover, multiple images may be seen in a column or frame. A column is very likely to contain several lines of text, which can be a combination of characters and images. The Novel class and its entity classes provide methods to manipulate contents such as set(), get(), remove(). A UML class diagram is shown below that depicts many composition relationships. Please re-design it into a hierarchical representation to improve quality." +
                "- I\n" +
                "really believe he is Antichrist - I will have nothing more\n" +
                "to do with you and you are no longer my friend, no longer\n" +
                "my ‘faithful slave,’ as you call yourself" +
                "But how do you\n" +
                "do? I see I have frightened you - sit down and tell me all\n" +
                "the news";

        NovelComponentIF page_one = new Page("First Page");
        NovelComponentIF page_two = new Page("Second Page");
        NovelComponentIF column_left_one = new Column("Left Column");
        NovelComponentIF column_right_one = new Column("Right Column");
        NovelComponentIF text = new LineOfText("LineOfText 1");
        NovelComponentIF chara = new Character("lab8",input);

        ((LineOfText) text).addChild(chara);
        ((Column) column_left_one).addChild(text);
        ((Page) page_one).addChild(column_left_one);
        ((Page) page_one).addChild(column_right_one);
        ((Novel) book_one).addChild(page_one);
        ((Novel) book_one).addChild(page_two);

        int len = book_one.getCharLength();
        System.out.println(book_one.getType()+" : <<"+ book_one.getName()+">> has char : " + len);

        int count = book_one.getElementCount();
        System.out.println(book_one.getType()+" : <<"+ book_one.getName()+ ">> has total" + count + " elements");

        System.out.println("including: ");
        book_one.displayChildren("");

        System.out.println("--------------------------------------------");
        NovelComponentIF book_two = new Novel("STEVE JOBS");
        String input2 = "When Paul Jobs was mustered out of the Coast Guard after World War II, he made \n" +
                "a wager with his crewmates.\n" +
                "They had arrived in San Francisco, where their ship \n" +
                "was decommissioned, and Paul bet that he would find himself a wife within two \n" +
                "weeks.\n";

        NovelComponentIF page_a = new Page("Abstract");
        NovelComponentIF page_b = new Page("Table of content");
        NovelComponentIF column_one = new Column("aab");
        NovelComponentIF column_two = new Column("bbc");
        NovelComponentIF column_three = new Column("ccd");
        NovelComponentIF column_four = new Column("dde");
        NovelComponentIF frame_one = new Frame("front-end");
        NovelComponentIF line_one = new LineOfText("Head");
        NovelComponentIF line_two = new LineOfText("Head1.1");
        NovelComponentIF text1 = new Character("question",input2);

        ((LineOfText) line_one).addChild(text1);
        ((Frame) frame_one).addChild(line_one);
        ((Frame) frame_one).addChild(line_two);
        ((Frame) frame_one).addChild(column_four);
        ((Page) page_a).addChild(frame_one);
        ((Page) page_b).addChild(column_one);
        ((Page) page_b).addChild(column_two);
        ((Page) page_b).addChild(column_three);
        ((Novel) book_two).addChild(page_a);
        ((Novel) book_two).addChild(page_b);
        int count_2 = book_two.getElementCount();
        System.out.println(book_two.getType()+" : <<"+ book_two.getName()+ ">> totally has " + count_2 + " elements");

        System.out.println("including: ");
        book_two.displayChildren("");
    }
}

