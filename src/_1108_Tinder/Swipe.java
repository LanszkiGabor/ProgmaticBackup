package _1108_Tinder;

import java.util.Date;

public class Swipe {

    enum SwipeAction {LIKE, DISLIKE}

    private User swiperUser;
    private User swipedUser;
    private SwipeAction swipeAction;
    private Date date;


    public Swipe(User swiperUser, User swipedUser, SwipeAction swipeAction, Date date) {
        this.swiperUser = swiperUser;
        this.swipedUser = swipedUser;
        this.swipeAction = swipeAction;
        this.date = date;
    }

    public Swipe(User swiperUser, User swipedUser, String swipeAction, int year, int month, int day, int hour, int min, int sec) {
        this.swiperUser = swiperUser;
        this.swipedUser = swipedUser;
        this.swipeAction = SwipeAction.valueOf(swipeAction);
        this.date = new Date(year,month,day,hour,min,sec);
    }

    public boolean isLike(){
        return this.swipeAction == SwipeAction.LIKE;
    }


    public User getSwiperUser() {
        return swiperUser;
    }

    public void setSwiperUser(User swiperUser) {
        this.swiperUser = swiperUser;
    }

    public User getSwipedUser() {
        return swipedUser;
    }

    public void setSwipedUser(User swipedUser) {
        this.swipedUser = swipedUser;
    }

    public SwipeAction getSwipeAction() {
        return swipeAction;
    }

    public void setSwipeAction(SwipeAction swipeAction) {
        this.swipeAction = swipeAction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
