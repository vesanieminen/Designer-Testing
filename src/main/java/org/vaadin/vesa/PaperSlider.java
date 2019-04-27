package org.vaadin.vesa;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider<T extends Number> extends AbstractSinglePropertyField<PaperSlider<T>, T> {

    public PaperSlider() {
        super("value", null, false);
    }

    public PaperSlider(T defaultValue) {
        super("value", defaultValue, false);
    }

    public void setPin(boolean pin) {
        getElement().setProperty("pin", pin);
    }
    public boolean isPin() {
        return getElement().getProperty("pin", false);
    }

}
