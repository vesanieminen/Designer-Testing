package org.vaadin.vesa;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.shared.Registration;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider extends Component {

    private double scale = 1.0;

    @DomEvent("change")
    public static class ChangeEvent extends ComponentEvent<PaperSlider> {
        public ChangeEvent(PaperSlider source, boolean fromClient) {
            super(source, fromClient);
        }
    }

    public PaperSlider() {
    }

    public PaperSlider(double scale) {
        this.scale = scale;
    }

    public Registration addChangeListener(ComponentEventListener<ChangeEvent> listener) {
        return addListener(ChangeEvent.class, listener);
    }

    public void setPin(boolean pin) {
        getElement().setProperty("pin", pin);
    }

    @Synchronize("change")
    public boolean isPin() {
        return getElement().getProperty("pin", false);
    }

    public void setValue(double value) {
        getElement().setProperty("value", value * scale);
    }

    @Synchronize("change")
    public Double getValue() {
        return Double.parseDouble(getElement().getProperty("value")) / scale;
    }

    public void setMin(double min) {
        getElement().setProperty("min", min * scale);
    }

    public void setMax(double max) {
        getElement().setProperty("max", max * scale);
    }

}
