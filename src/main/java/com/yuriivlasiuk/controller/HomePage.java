package com.yuriivlasiuk.controller;

import com.yuriivlasiuk.service.MathService;
import com.yuriivlasiuk.service.MathServiceImpl;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;
    private String field = "";
    private MathService mathService = new MathServiceImpl();

    public HomePage(final PageParameters parameters) {
        super(parameters);

        Form<?> form = new Form("form");
        add(form);

        final TextField resultField = new TextField("resultField", new PropertyModel<>(this, "field"));
        resultField.setOutputMarkupId(true);
        form.add(resultField);

        AjaxButton calculateButton = new AjaxButton("calculateButton") {
            @Override
            protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                super.onSubmit(target, form);
                field = mathService.calculate(field);
                target.add(resultField);


            }
        };

        form.add(calculateButton);

    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
