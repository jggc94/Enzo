/*
 * Copyright (c) 2013 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.enzo.gauge;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Dimension2D;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.List;


/**
 * Created by
 * User: hansolo
 * Date: 17.07.13
 * Time: 16:57
 */
public class RadialBargraphBuilder<B extends RadialBargraphBuilder<B>> {
    private HashMap<String, Property> properties = new HashMap<>();


    // ******************** Constructors **************************************
    protected RadialBargraphBuilder() {}


    // ******************** Methods *******************************************
    public static final RadialBargraphBuilder create() {
        return new RadialBargraphBuilder();
    }

    public final RadialBargraphBuilder value(final double VALUE) {
        properties.put("value", new SimpleDoubleProperty(VALUE));
        return this;
    }

    public final RadialBargraphBuilder minValue(final double MIN_VALUE) {
        properties.put("minValue", new SimpleDoubleProperty(MIN_VALUE));
        return this;
    }

    public final RadialBargraphBuilder maxValue(final double MAX_VALUE) {
        properties.put("maxValue", new SimpleDoubleProperty(MAX_VALUE));
        return this;
    }

    public final RadialBargraphBuilder threshold(final double THRESHOLD) {
        properties.put("threshold", new SimpleDoubleProperty(THRESHOLD));
        return this;
    }

    public final RadialBargraphBuilder sections(final Section... SECTIONS) {
        properties.put("sectionsArray", new SimpleObjectProperty<>(SECTIONS));
        return this;
    }

    public final RadialBargraphBuilder sections(final List<Section> SECTIONS) {
        properties.put("sectionsList", new SimpleObjectProperty<>(SECTIONS));
        return this;
    }

    public final RadialBargraphBuilder markers(final Marker... MARKERS) {
        properties.put("markersArray", new SimpleObjectProperty<>(MARKERS));
        return this;
    }

    public final RadialBargraphBuilder markers(final List<Marker> MARKERS) {
        properties.put("markersList", new SimpleObjectProperty<>(MARKERS));
        return this;
    }

    public final RadialBargraphBuilder decimals(final int DECIMALS) {
        properties.put("decimals", new SimpleIntegerProperty(DECIMALS));
        return this;
    }

    public final RadialBargraphBuilder title(final String TITLE) {
        properties.put("title", new SimpleStringProperty(TITLE));
        return this;
    }

    public final RadialBargraphBuilder unit(final String UNIT) {
        properties.put("unit", new SimpleStringProperty(UNIT));
        return this;
    }

    public final RadialBargraphBuilder animated(final boolean ANIMATED) {
        properties.put("animated", new SimpleBooleanProperty(ANIMATED));
        return this;
    }

    public final RadialBargraphBuilder animationDuration(final double ANIMATION_DURATION) {
        properties.put("animationDuration", new SimpleDoubleProperty(ANIMATION_DURATION));
        return this;
    }

    public final RadialBargraphBuilder minMeasuredValueVisible(final boolean MIN_MEASURED_VALUE_VISIBLE) {
        properties.put("minMeasuredValueVisible", new SimpleBooleanProperty(MIN_MEASURED_VALUE_VISIBLE));
        return this;
    }

    public final RadialBargraphBuilder maxMeasuredValueVisible(final boolean MAX_MEASURED_VALUE_VISIBLE) {
        properties.put("maxMeasuredValueVisible", new SimpleBooleanProperty(MAX_MEASURED_VALUE_VISIBLE));
        return this;
    }

    public final RadialBargraphBuilder thresholdVisible(final boolean THRESHOLD_VISIBLE) {
        properties.put("thresholdVisible", new SimpleBooleanProperty(THRESHOLD_VISIBLE));
        return this;
    }

    public final RadialBargraphBuilder startAngle(final double START_ANGLE) {
        properties.put("startAngle", new SimpleDoubleProperty(START_ANGLE));
        return this;
    }

    public final RadialBargraphBuilder angleRange(final double ANGLE_RANGE) {
        properties.put("angleRange", new SimpleDoubleProperty(ANGLE_RANGE));
        return this;
    }

    public final RadialBargraphBuilder autoScale(final boolean AUTO_SCALE) {
        properties.put("autoScale", new SimpleBooleanProperty(AUTO_SCALE));
        return this;
    }

    public final RadialBargraphBuilder barColor(final Color BAR_COLOR) {
        properties.put("barColor", new SimpleObjectProperty<>(BAR_COLOR));
        return this;
    }

    public final RadialBargraphBuilder numberFormat(final RadialBargraph.NumberFormat NUMBER_FORMAT) {
        properties.put("numberFormat", new SimpleObjectProperty<>(NUMBER_FORMAT));
        return this;
    }

    public final RadialBargraphBuilder minorTickSpace(final double MINOR_TICK_SPACE) {
        properties.put("minorTickSpace", new SimpleDoubleProperty(MINOR_TICK_SPACE));
        return this;
    }

    public final RadialBargraphBuilder plainValue(final boolean PLAIN_VALUE) {
        properties.put("plainValue", new SimpleBooleanProperty(PLAIN_VALUE));
        return this;
    }

    public final RadialBargraphBuilder tickLabelFill(final Color TICK_LABEL_FILL) {
        properties.put("tickLabelFill", new SimpleObjectProperty<>(TICK_LABEL_FILL));
        return this;
    }

    public final RadialBargraphBuilder section0Fill(final Color SECTION_0_FILL) {
        properties.put("section0Fill", new SimpleObjectProperty<>(SECTION_0_FILL));
        return this;
    }

    public final RadialBargraphBuilder section1Fill(final Color SECTION_1_FILL) {
        properties.put("section1Fill", new SimpleObjectProperty<>(SECTION_1_FILL));
        return this;
    }

    public final RadialBargraphBuilder section2Fill(final Color SECTION_2_FILL) {
        properties.put("section2Fill", new SimpleObjectProperty<>(SECTION_2_FILL));
        return this;
    }

    public final RadialBargraphBuilder section3Fill(final Color SECTION_3_FILL) {
        properties.put("section3Fill", new SimpleObjectProperty<>(SECTION_3_FILL));
        return this;
    }

    public final RadialBargraphBuilder section4Fill(final Color SECTION_4_FILL) {
        properties.put("section4Fill", new SimpleObjectProperty<>(SECTION_4_FILL));
        return this;
    }

    public final RadialBargraphBuilder section5Fill(final Color SECTION_5_FILL) {
        properties.put("section5Fill", new SimpleObjectProperty<>(SECTION_5_FILL));
        return this;
    }

    public final RadialBargraphBuilder section6Fill(final Color SECTION_6_FILL) {
        properties.put("section6Fill", new SimpleObjectProperty<>(SECTION_6_FILL));
        return this;
    }

    public final RadialBargraphBuilder section7Fill(final Color SECTION_7_FILL) {
        properties.put("section7Fill", new SimpleObjectProperty<>(SECTION_7_FILL));
        return this;
    }

    public final RadialBargraphBuilder section8Fill(final Color SECTION_8_FILL) {
        properties.put("section8Fill", new SimpleObjectProperty<>(SECTION_8_FILL));
        return this;
    }

    public final RadialBargraphBuilder section9Fill(final Color SECTION_9_FILL) {
        properties.put("section9Fill", new SimpleObjectProperty<>(SECTION_9_FILL));
        return this;
    }

    public final RadialBargraphBuilder marker0Fill(final Color MARKER_0_FILL) {
        properties.put("marker0Fill", new SimpleObjectProperty<>(MARKER_0_FILL));
        return this;
    }

    public final RadialBargraphBuilder marker1Fill(final Color MARKER_1_FILL) {
        properties.put("marker1Fill", new SimpleObjectProperty<>(MARKER_1_FILL));
        return this;
    }

    public final RadialBargraphBuilder marker2Fill(final Color MARKER_2_FILL) {
        properties.put("marker2Fill", new SimpleObjectProperty<>(MARKER_2_FILL));
        return this;
    }

    public final RadialBargraphBuilder marker3Fill(final Color MARKER_3_FILL) {
        properties.put("marker3Fill", new SimpleObjectProperty<>(MARKER_3_FILL));
        return this;
    }

    public final RadialBargraphBuilder marker4Fill(final Color MARKER_4_FILL) {
        properties.put("marker4Fill", new SimpleObjectProperty<>(MARKER_4_FILL));
        return this;
    }

    public final RadialBargraphBuilder sectionsVisible(final boolean SECTIONS_VISIBLE) {
        properties.put("sectionsVisible", new SimpleBooleanProperty(SECTIONS_VISIBLE));
        return this;
    }

    public final RadialBargraphBuilder markersVisible(final boolean MARKERS_VISIBLE) {
        properties.put("markersVisible", new SimpleBooleanProperty(MARKERS_VISIBLE));
        return this;
    }

    public final RadialBargraphBuilder styleClass(final String... STYLES) {
        properties.put("styleClass", new SimpleObjectProperty<>(STYLES));
        return this;
    }

    public final B prefSize(final double WIDTH, final double HEIGHT) {
        properties.put("prefSize", new SimpleObjectProperty<>(new Dimension2D(WIDTH, HEIGHT)));
        return (B)this;
    }

    public final B prefWidth(final double PREF_WIDTH) {
        properties.put("prefWidth", new SimpleDoubleProperty(PREF_WIDTH));
        return (B)this;
    }
    public final B prefHeight(final double PREF_HEIGHT) {
        properties.put("prefHeight", new SimpleDoubleProperty(PREF_HEIGHT));
        return (B)this;
    }

    public final B minWidth(final double MIN_WIDTH) {
        properties.put("minWidth", new SimpleDoubleProperty(MIN_WIDTH));
        return (B)this;
    }
    public final B minHeight(final double MIN_HEIGHT) {
        properties.put("minHeight", new SimpleDoubleProperty(MIN_HEIGHT));
        return (B)this;
    }

    public final B maxWidth(final double MAX_WIDTH) {
        properties.put("maxWidth", new SimpleDoubleProperty(MAX_WIDTH));
        return (B)this;
    }
    public final B maxHeight(final double MAX_HEIGHT) {
        properties.put("maxHeight", new SimpleDoubleProperty(MAX_HEIGHT));
        return (B)this;
    }

    public final B scaleX(final double SCALE_X) {
        properties.put("scaleX", new SimpleDoubleProperty(SCALE_X));
        return (B)this;
    }
    public final B scaleY(final double SCALE_Y) {
        properties.put("scaleY", new SimpleDoubleProperty(SCALE_Y));
        return (B)this;
    }

    public final B layoutX(final double LAYOUT_X) {
        properties.put("layoutX", new SimpleDoubleProperty(LAYOUT_X));
        return (B)this;
    }
    public final B layoutY(final double LAYOUT_Y) {
        properties.put("layoutY", new SimpleDoubleProperty(LAYOUT_Y));
        return (B)this;
    }

    public final B translateX(final double TRANSLATE_X) {
        properties.put("translateX", new SimpleDoubleProperty(TRANSLATE_X));
        return (B)this;
    }
    public final B translateY(final double TRANSLATE_Y) {
        properties.put("translateY", new SimpleDoubleProperty(TRANSLATE_Y));
        return (B)this;
    }

    public final RadialBargraph build() {
        final RadialBargraph CONTROL = new RadialBargraph();
        properties.forEach((key, property) -> {
            if ("prefSize".equals(key)) {
                Dimension2D dim = ((ObjectProperty<Dimension2D>) property).get();
                CONTROL.setPrefSize(dim.getWidth(), dim.getHeight());
            } else if("prefWidth".equals(key)) {
                CONTROL.setPrefWidth(((DoubleProperty) property).get());
            } else if("prefHeight".equals(key)) {
                CONTROL.setPrefHeight(((DoubleProperty) property).get());
            } else if("minWidth".equals(key)) {
                CONTROL.setMinWidth(((DoubleProperty) property).get());
            } else if("minHeight".equals(key)) {
                CONTROL.setMinHeight(((DoubleProperty) property).get());
            } else if("maxWidth".equals(key)) {
                CONTROL.setMaxWidth(((DoubleProperty) property).get());
            } else if("maxHeight".equals(key)) {
                CONTROL.setMaxHeight(((DoubleProperty) property).get());
            } else if("scaleX".equals(key)) {
                CONTROL.setScaleX(((DoubleProperty) property).get());
            } else if("scaleY".equals(key)) {
                CONTROL.setScaleY(((DoubleProperty) property).get());
            } else if ("layoutX".equals(key)) {
                CONTROL.setLayoutX(((DoubleProperty) property).get());
            } else if ("layoutY".equals(key)) {
                CONTROL.setLayoutY(((DoubleProperty) property).get());
            } else if ("translateX".equals(key)) {
                CONTROL.setTranslateX(((DoubleProperty) property).get());
            } else if ("translateY".equals(key)) {
                CONTROL.setTranslateY(((DoubleProperty) property).get());
            } else if("styleClass".equals(key)) {
                CONTROL.getStyleClass().setAll("gauge");
                CONTROL.getStyleClass().addAll(((ObjectProperty<String[]>) property).get());
            } else if("value".equals(key)) {
                CONTROL.setValue(((DoubleProperty) property).get());
            } else if("minValue".equals(key)) {
                CONTROL.setMinValue(((DoubleProperty) property).get());
            } else if("maxValue".equals(key)) {
                CONTROL.setMaxValue(((DoubleProperty) property).get());
            } else if("threshold".equals(key)) {
                CONTROL.setThreshold(((DoubleProperty) property).get());
            } else if("sectionsArray".equals(key)) {
                CONTROL.setSections(((ObjectProperty<Section[]>) property).get());
            } else if("sectionsList".equals(key)) {
                CONTROL.setSections(((ObjectProperty<List<Section>>) property).get());
            } else if("markersArray".equals(key)) {
                CONTROL.setMarkers(((ObjectProperty<Marker[]>) property).get());
            } else if("markersList".equals(key)) {
                CONTROL.setMarkers(((ObjectProperty<List<Marker>>) property).get());
            } else if("decimals".equals(key)) {
                CONTROL.setDecimals(((IntegerProperty) property).get());
            } else if("title".equals(key)) {
                CONTROL.setTitle(((StringProperty) property).get());
            } else if("unit".equals(key)) {
                CONTROL.setUnit(((StringProperty) property).get());
            } else if("animated".equals(key)) {
                CONTROL.setAnimated(((BooleanProperty) property).get());
            } else if("animationDuration".equals(key)) {
                CONTROL.setAnimationDuration(((DoubleProperty) property).get());
            } else if("minMeasuredValueVisible".equals(key)) {
                CONTROL.setMinMeasuredValueVisible(((BooleanProperty) property).get());
            } else if("maxMeasuredValueVisible".equals(key)) {
                CONTROL.setMaxMeasuredValueVisible(((BooleanProperty) property).get());
            } else if("thresholdVisible".equals(key)) {
                CONTROL.setThresholdVisible(((BooleanProperty) property).get());
            } else if("startAngle".equals(key)) {
                CONTROL.setStartAngle(((DoubleProperty) property).get());
            } else if("angleRange".equals(key)) {
                CONTROL.setAngleRange(((DoubleProperty) property).get());
            } else if ("autoScale".equals(key)) {
                CONTROL.setAutoScale(((BooleanProperty) property).get());
            } else if("barColor".equals(key)) {
                CONTROL.setBarColor(((ObjectProperty<Color>) property).get());
            } else if("numberFormat".equals(key)) {
                CONTROL.setNumberFormat(((ObjectProperty<RadialBargraph.NumberFormat>) property).get());
            } else if("minorTickSpace".equals(key)) {
                CONTROL.setMinorTickSpace(((DoubleProperty) property).get());
            } else if("plainValue".equals(key)) {
                CONTROL.setPlainValue(((BooleanProperty) property).get());
            } else if("section0Fill".equals(key)) {
                CONTROL.setSection0Fill(((ObjectProperty<Color>) property).get());
            } else if("section1Fill".equals(key)) {
                CONTROL.setSection1Fill(((ObjectProperty<Color>) property).get());
            } else if("section2Fill".equals(key)) {
                CONTROL.setSection2Fill(((ObjectProperty<Color>) property).get());
            } else if("section3Fill".equals(key)) {
                CONTROL.setSection3Fill(((ObjectProperty<Color>) property).get());
            } else if("section4Fill".equals(key)) {
                CONTROL.setSection4Fill(((ObjectProperty<Color>) property).get());
            } else if("section5Fill".equals(key)) {
                CONTROL.setSection5Fill(((ObjectProperty<Color>) property).get());
            } else if("section6Fill".equals(key)) {
                CONTROL.setSection6Fill(((ObjectProperty<Color>) property).get());
            } else if("section7Fill".equals(key)) {
                CONTROL.setSection7Fill(((ObjectProperty<Color>) property).get());
            } else if("section8Fill".equals(key)) {
                CONTROL.setSection8Fill(((ObjectProperty<Color>) property).get());
            } else if("section9Fill".equals(key)) {
                CONTROL.setSection9Fill(((ObjectProperty<Color>) property).get());
            } else if("marker0Fill".equals(key)) {
                CONTROL.setMarker0Fill(((ObjectProperty<Color>) property).get());
            } else if("marker1Fill".equals(key)) {
                CONTROL.setMarker1Fill(((ObjectProperty<Color>) property).get());
            } else if("marker2Fill".equals(key)) {
                CONTROL.setMarker2Fill(((ObjectProperty<Color>) property).get());
            } else if("marker3Fill".equals(key)) {
                CONTROL.setMarker3Fill(((ObjectProperty<Color>) property).get());
            } else if("marker4Fill".equals(key)) {
                CONTROL.setMarker4Fill(((ObjectProperty<Color>) property).get());
            } else if("sectionsVisible".equals(key)) {
                CONTROL.setSectionsVisible(((BooleanProperty) property).get());
            } else if("markersVisible".equals(key)) {
                CONTROL.setMarkersVisible(((BooleanProperty) property).get());
            }
        });
        return CONTROL;
    }
}