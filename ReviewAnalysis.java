import java.util.ArrayList;

public class ReviewAnalysis  { 
private Review[] allReviews; 

public ReviewAnalysis(Review[] reviews)  {  
    allReviews = reviews;
}  

public double getAverageRating()  {
    int len = allReviews.length;
    double sum = 0;
    for (int i = 0; i < len; i++) {
        sum += allReviews[i].getRating();
    }
    return (sum / len);
 }  
 
public ArrayList<String> collectComments()  {
    int len = allReviews.length;

    ArrayList<String> array = new ArrayList<String>();
    for (int i = 0; i < len; i++) {
        String comment = allReviews[i].getComment();
        if (comment.indexOf("!") >= 0) {
            String newcomment;
            newcomment = i + "-" + comment;
            if (comment.substring(comment.length() - 1).equals(".") == false && comment.substring(comment.length() - 1).equals("!") == false) {
                newcomment += ".";
            }
            array.add(newcomment);
        }
    }
    return array;
  }  
}  
