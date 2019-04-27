package org.vaadin.vesa;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        //add(new PaperSlider<>(0));

        add(new MyControls());
    }
}
