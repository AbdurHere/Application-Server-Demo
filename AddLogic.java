

package sda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddLogic {
  private String x, h;

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }


    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

public void WillUpdate() throws ParseException
{
    
    if(x.contains("-03")) {
    h = "Happy birthday,\n March Peeps,\n\r   "
            + "When you don’t know what to do, you don’t have to pretend to know what to do. It’s better that you do no pretending this month.\n"
            + " Instead, revel in the beauty of not knowing. Ask for help both from other humans and also the universe."
            + " \n\r ARIES\n (March 21 to April 19) \n PISCES \n (February 19 to March 20)";
}
   else if(x.contains("-04")) {
    h = "Happy birthday,\n April Peeps,\n\r   "
            + "I actually have no idea what is going on with the stars this month. This might make me a shitty astrologer;\n"
            + " it also makes me a person who knows that we ultimately lack control of external forces while remaining in control\n"
            + " of our intention. This month, let your field of intention be the whole galaxy."
           
            + " \n\r ARIES\n (March 21 to April 19) \n TAURUS \n (April 20 to May 20)";
} 
   else  if(x.contains("-01")) {
    h = " Happy birthday,\n January Peeps,\n\r  I never thought that January is the right time to take down the tree.\n"
            + " January is when we need that tinsel and glitter the most — also February, March, and even April before\n"
            + " the first buds of spring appear. How can you find ways to make holidays out of the ordinary? Can every day\n"
            + " be a little door in a wild advent calendar? \n\r CAPRICORN\n (December 22 to January 19) \n AQUARIUS \n (January 20 to February 18)";
}
  else    if(x.contains("-02")) {
    h = "Happy birthday,\n Febuarary Peeps,\n\r "
            + "Lewis Carroll, a fellow Aquarian who wrote Through the Looking Glass, and What Alice Found There,\n"
            + " knew something about rabbit holes. He knew the human potential to go down them, to go to that place\n"
            + " in our heads where reality shifts and we buy into whatever fantasies our minds create. This month,\n"
            + " be aware of your own unique perception and its ability to color or discolor a situation — use it to your\n"
            + " advantage."
            + "\n\r PISCES \n (February 19 to March 20) \n AQUARIUS \n (January 20 to February 18)";
}
    else   if(x.contains("-05")) {
    h = "Happy birthday,\n May Peeps,\n\r "
            + "I actually have no idea what is going on with the stars this month. This might make me a shitty astrologer; \n"
            + "it also makes me a person who knows that we ultimately lack control of external forces while remaining in\n"
            + " control of our intention. This month, let your field of intention be the whole galaxy."
            + " \n\r GEMINI\n (May 21 to June 20) \n TAURUS \n (April 20 to May 20)";
}
     else   if(x.contains("-06")) {
    h = "Happy birthday,\n June Peeps,\n\r"
            + "Sometimes it feels like there is so much suffering in the world that we have to just shut down. This is not\n"
            + " the month to do that. Stay open this month to painful feelings and experiences, so that you don’t miss out on\n"
            + " the joy, mystery, and quiet moments that are often on the flip side of the coin."
            + " \n\r CANCER\n (June 21 to July 22) \n TAURUS \n (April 20 to May 20)";
}
     else    if(x.contains("-07")) {
    h = "Happy birthday,\n July Peeps,\n\r"
            + "Have you ever looked at someone and thought that they hated you, only to learn later they had a frown on their face\n"
            + " because they were having a shitty day? This is humanity most of the time — and what other people think of you isn’t\n"
            + " your business anyway. Let the knowledge that most people are thinking about themselves set you free."
            + " \n\r CANCER\n (June 21 to July 22) \n LEO \n (July 23 to August 22)";
}
     else     if(x.contains("-08")) {
    h = "Happy birthday,\n August Peeps,\n\r"
            + "Nothing has to be a whole month or a whole week or a whole day. What I mean by that is, if you are having a shitty moment,\n"
            + " it can be just that: a moment. Then you can start over again at any point. The sun is not man-made, but the units of time that\n"
            + "we clump together to superimpose our own narrative on a larger world are fake as fuck. It’s basically a new year any time."
            + " \n\r VIRGO\n (August 23 to September 22) \n LEO \n (July 23 to August 22)";
}
      else     if(x.contains("-09")) {
    h = "Happy birthday,\n September Peeps,\n\r"
            + "I don’t read horoscopes about love, because as a former horoscope addict who got into astrology to try to control the realm of passion,\n"
            + " it always annoyed me when a fellow Virgo was lucky in love and I wasn’t. What I will say on the topic is that if you are looking to the\n"
            + " stars to control or manipulate another person, they probably aren’t the right person."
            + " \n\r VIRGO\n (August 23 to September 22) \n LEO \n (July 23 to August 22)";
}
      else      if(x.contains("-10")) {
    h = "Happy birthday,\n October Peeps,\n\r"
            + "It’s never too late to escape cognitive dissonance. Better to admit you are wrong then cover your ass. If you feel like you aren’t wrong about\n"
            + " anything, then that’s another horoscope entirely. But if you see a place where you have made an error, it’s better this month — and all months \n"
            + "— not to double down."
            + " \n\r LIBRA\n (September 23 to October 22) \n Scorpio \n (October 23 to November 21)";
}
      else   if(x.contains("-11")) {
    h = "Happy birthday,\n November Peeps,\n\r "
            + "There’s never going to be enough outer beauty. After the skin comes the clothes and after the clothes comes the makeup and after the makeup comes the hair,\n"
            + " or whichever order your obsessions follow. Outer beauty is great when it’s left in the fun realm, but if you are looking for the infinite, internal beauty \n"
            + "is the only way to go."
            + " \n\r SAGITTARIUS\n (November 22 to December 21) \n Scorpio \n (October 23 to November 21)";
}
            else  if(x.contains("-12")) {
    h = "Happy birthday,\n December Peeps,\n\r"
            + "I don’t know that much about neuroplasticity, but I do know about self-doubt and how negative voices can feel impenetrable.\n"
            + " Yet if we create a refusal to listen to a particular thought — a mindwall of sorts — that thought will eventually give up.\n"
            + " Some thoughts are easier than others. Try this with one of yours this month."
            + " \n\r SAGITTARIUS\n (November 22 to December 21) \n CAPRICORN\n (December 22 to January 19)";
}
   
    else {h="horosope is fake";}

}
    
}
