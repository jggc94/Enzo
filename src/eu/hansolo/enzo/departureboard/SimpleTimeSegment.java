package eu.hansolo.enzo.departureboard;

import eu.hansolo.enzo.imgsplitflap.SplitFlap;
import eu.hansolo.enzo.imgsplitflap.SplitFlapBuilder;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.layout.HBox;


/**
 * Created by
 * User: hansolo
 * Date: 17.04.13
 * Time: 15:25
 */
public class SimpleTimeSegment extends HBox {
    private SplitFlap      hourLeft;
    private SplitFlap      hourRight;
    private SplitFlap      minLeft;
    private SplitFlap      minRight;
    private String         defaultHours;
    private StringProperty hours;
    private String         defaultMinutes;
    private StringProperty minutes;


    // ******************** Constructors **************************************
    public SimpleTimeSegment() {
        hourLeft  = SplitFlapBuilder.create()
                                    .selection(SplitFlap.TIME_0_TO_5)
                                    .text("0")
                                    .flipTime(100)
                                    .build();
        hourLeft.setPrefSize(35, 60);
        hourRight = SplitFlapBuilder.create()
                                    .selection(SplitFlap.TIME_0_TO_9)
                                    .text("0")
                                    .flipTime(100)
                                    .build();
        hourRight.setPrefSize(35, 60);
        minLeft   = SplitFlapBuilder.create()
                                    .selection(SplitFlap.TIME_0_TO_5)
                                    .text("0")
                                    .flipTime(100)
                                    .build();
        minLeft.setPrefSize(23, 40);
        minRight  = SplitFlapBuilder.create()
                                    .selection(SplitFlap.TIME_0_TO_9)
                                    .text("0")
                                    .flipTime(100)
                                    .build();
        minRight.setPrefSize(23, 40);

        setSpacing(2);
        getChildren().addAll(hourLeft,
                             hourRight,
                             minLeft,
                             minRight);
    }


    // ******************** Methods *******************************************
    public final String getTime() {
        return (hours.get() + ":" + minutes.get());
    }
    public final void setTime(final String HOURS, final String MINUTES) {
        setHours(HOURS);
        setMinutes(MINUTES);
    }

    public final String getHours() {
        return null == hours ? defaultHours : hours.get();
    }
    public final void setHours(final String HOURS) {
        if (null == hours) {
            defaultHours = HOURS;
        } else {
            hours.set(HOURS);
        }

        if (HOURS.isEmpty()) {
            hourLeft.setText(" ");
            hourRight.setText(" ");
        } else {
            if (HOURS.length() > 1) {
                hourLeft.setText(HOURS.substring(0, 1));
                hourRight.setText(HOURS.substring(1, 2));
            } else {
                hourLeft.setText("0");
                hourRight.setText(HOURS.substring(0, 1));
            }
        }
    }
    public final StringProperty hoursProperty() {
        if (null == hours) {
            hours = new SimpleStringProperty(this, "hours", defaultHours);
        }
        return hours;
    }

    public final String getMinutes() {
        return null == minutes ? defaultMinutes : minutes.get();
    }
    public final void setMinutes(final String MINUTES) {
        if (null == minutes) {
            defaultMinutes = MINUTES;
        } else {
            minutes.set(MINUTES);
        }

        if (MINUTES.isEmpty()) {
            minLeft.setText(" ");
            minRight.setText(" ");
        } else {
            if (MINUTES.length() > 1) {
                minLeft.setText(MINUTES.substring(0, 1));
                minRight.setText(MINUTES.substring(1, 2));
            } else {
                minLeft.setText("0");
                minRight.setText(MINUTES.substring(0, 1));
            }
        }
    }
    public final StringProperty minutesProperty() {
        if (null == minutes) {
            minutes = new SimpleStringProperty(this, "minutes", defaultMinutes);
        }
        return minutes;
    }
}
