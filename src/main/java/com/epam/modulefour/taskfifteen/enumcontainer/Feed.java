package com.epam.modulefour.taskfifteen.enumcontainer;

public enum Feed {
    FULLPANSION("полный пансион"),
    BREAKFAST("только завтрак"),
    BREAKFASTANDSUPPER("завтрак и ужин"),
    SUPPER("ужин"),
    NONE("оплачивается отдельно");

    private String feedtypeTranslation;
    Feed(String feedtypeTranslation) {
        this.feedtypeTranslation = feedtypeTranslation;
    }
    public String getFeedtypeTranslation() {
        return feedtypeTranslation;
    }

    @Override
    public String toString() {
        return feedtypeTranslation;
    }
}
