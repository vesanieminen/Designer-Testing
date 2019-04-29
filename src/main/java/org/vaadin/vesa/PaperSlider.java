package org.vaadin.vesa;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider extends AbstractSinglePropertyField<PaperSlider, Double> implements HasStyle {

    public static final double SCALE_MULTIPLIER = 1.0;

    public PaperSlider() {
        super("value", 0.0, false);
    }

    public PaperSlider(double min, double max, double initial) {
        super("value", initial, false);
        getElement().setProperty("max", max * SCALE_MULTIPLIER);
        getElement().setProperty("min", min * SCALE_MULTIPLIER);
        getStyle().set("width", "100px");
    }

    public void setMinValue(double min) {
        getElement().setProperty("min", min * SCALE_MULTIPLIER);
    }

    public void setMaxValue(double max) {
        getElement().setProperty("max", max * SCALE_MULTIPLIER);
    }

    @Override
    public void setValue(Double value) {
        getElement().setProperty("value", value * SCALE_MULTIPLIER);
    }

    @Override
    public Double getValue() {
        return Double.parseDouble(getElement().getProperty("value")) / SCALE_MULTIPLIER;
    }
}
