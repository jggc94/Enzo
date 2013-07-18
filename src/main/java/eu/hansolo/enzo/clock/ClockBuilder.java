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

package eu.hansolo.enzo.clock;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Dimension2D;

import java.util.HashMap;


/**
 * Created by
 * User: hansolo
 * Date: 09.01.13
 * Time: 09:02
 */
public class ClockBuilder<B extends ClockBuilder<B>> {
    private HashMap<String, Property> properties = new HashMap<>();


    // ******************** Constructors **************************************
    protected ClockBuilder() {
    }


    // ******************** Methods *******************************************
    public final static ClockBuilder create() {
        return new ClockBuilder();
    }

    public final ClockBuilder nightMode(final boolean NIGHT_MODE) {
        properties.put("nightMode", new SimpleBooleanProperty(NIGHT_MODE));
        return this;
    }

    public final ClockBuilder design(final Clock.Design DESIGN) {
        properties.put("design", new SimpleObjectProperty<Clock.Design>(DESIGN));
        return this;
    }

    public final ClockBuilder discreteSecond(final boolean DISCRETE_SECOND) {
        properties.put("discreteSecond", new SimpleBooleanProperty(DISCRETE_SECOND));
        return this;
    }

    public final ClockBuilder secondPointerVisible(final boolean SECOND_POINTER_VISIBLE) {
        properties.put("secondPointerVisible", new SimpleBooleanProperty(SECOND_POINTER_VISIBLE));
        return this;
    }

    public final ClockBuilder highlightVisible(final boolean HIGHLIGHT_VISIBLE) {
        properties.put("highlightVisible", new SimpleBooleanProperty(HIGHLIGHT_VISIBLE));
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


    public final Clock build() {
        final Clock CONTROL = new Clock();
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
            } else if ("nightMode".equals(key)) {
                CONTROL.setNightMode(((BooleanProperty) property).get());
            } else if ("design".equals(key)) {
                CONTROL.setDesign(((ObjectProperty<Clock.Design>) property).get());
            } else if ("discreteSecond".equals(key)) {
                CONTROL.setDiscreteSecond(((BooleanProperty) property).get());
            } else if ("secondPointerVisible".equals(key)) {
                CONTROL.setSecondPointerVisible(((BooleanProperty) property).get());
            } else if ("highlightVisible".equals(key)) {
                CONTROL.setHighlightVisible(((BooleanProperty) property).get());
            }
        });
        return CONTROL;
    }
}