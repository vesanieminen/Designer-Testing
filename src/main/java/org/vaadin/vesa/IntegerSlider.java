package org.vaadin.vesa;

import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the double-slider template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("integer-slider")
@HtmlImport("integer-slider.html")
@Uses(PaperSlider.class)
public class IntegerSlider extends PolymerTemplate<IntegerSlider.IntegerSliderModel> {

    @Id("slider") private PaperSlider<Integer> slider;

    /**
     * Creates a new DoubleSlider.
     */
    public IntegerSlider() {
        getModel().setCaption("hello!");
    }

    /**
     * This model binds properties between DoubleSlider and double-slider
     */
    public interface IntegerSliderModel extends TemplateModel {
        String getCaption();
        void setCaption(String caption);
    }

    public PaperSlider<Integer> getSlider() {
        return slider;
    }

    public void setSlider(PaperSlider<Integer> slider) {
        this.slider = slider;
    }

}
