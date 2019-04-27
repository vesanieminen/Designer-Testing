package org.vaadin.vesa;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class IntegerPaperSlider extends Component {

    @DomEvent("change")
    public static class ChangeEvent extends ComponentEvent<IntegerPaperSlider> {
        public ChangeEvent(IntegerPaperSlider source, boolean fromClient) {
            super(source, fromClient);
        }
    }

    public IntegerPaperSlider() {
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

    public void setValue(int value) {
        getElement().setProperty("value", value);
    }

    @Synchronize("change")
    public Integer getValue() {
        return Integer.parseInt(getElement().getProperty("value"));
    }

}
