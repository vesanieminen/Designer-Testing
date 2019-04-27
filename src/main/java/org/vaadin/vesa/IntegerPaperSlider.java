package org.vaadin.vesa;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class IntegerPaperSlider extends AbstractSinglePropertyField<IntegerPaperSlider, Integer> {

    public IntegerPaperSlider() {
        super("value", 0, false);
    }

    public void setPin(boolean pin) {
        getElement().setProperty("pin", pin);
    }
    public boolean isPin() {
        return getElement().getProperty("pin", false);
    }

}
