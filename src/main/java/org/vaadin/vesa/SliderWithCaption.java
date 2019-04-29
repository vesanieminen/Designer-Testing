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
@Tag("slider-with-caption")
@HtmlImport("slider-with-caption.html")
@Uses(PaperSlider.class)
public class SliderWithCaption extends PolymerTemplate<SliderWithCaption.SliderWithCaptionModel> {

    //@Id("slider") private PaperSlider slider;

    public SliderWithCaption() {
        getModel().setCaption("hello!");
    }

    /**
     * This model binds properties between SliderWithCaption and slider-with-caption
     */
    public interface SliderWithCaptionModel extends TemplateModel {
        String getCaption();
        void setCaption(String caption);
    }

    //public PaperSlider getSlider() {
    //    return slider;
    //}

    //public void setSlider(PaperSlider slider) {
    //    this.slider = slider;
    //}

}
