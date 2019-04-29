package org.vaadin.vesa;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        PaperSlider paperSlider = new PaperSlider();
        paperSlider.addValueChangeListener(e -> Notification.show("" +e.getValue()));
        add(paperSlider);

        add(new MyControls());
    }
}
