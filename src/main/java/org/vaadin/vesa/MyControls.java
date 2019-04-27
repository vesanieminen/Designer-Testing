package org.vaadin.vesa;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the my-controls template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("my-controls")
@HtmlImport("my-controls.html")
public class MyControls extends PolymerTemplate<MyControls.MyControlsModel> {

    @Id("positionSlider") private IntegerSlider positionSlider;
    @Id("playButton") private Button playButton;
    @Id("stopButton") private Button stopButton;
    @Id("label") private Label label;

    /**
     * Creates a new MyControls.
     */
    public MyControls() {
        positionSlider.getSlider().addValueChangeListener(e -> {
            label.setText("" + e.getValue());
        });
    }

    /**
     * This model binds properties between MyControls and my-controls
     */
    public interface MyControlsModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
