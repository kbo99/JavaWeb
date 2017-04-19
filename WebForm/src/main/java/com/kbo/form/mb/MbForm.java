/**
 * 
 */
package com.kbo.form.mb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.primefaces.component.calendar.Calendar;
import org.primefaces.component.fieldset.Fieldset;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.outputlabel.OutputLabel;
import org.primefaces.component.panel.Panel;
import org.primefaces.component.panelgrid.PanelGrid;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;
import org.primefaces.util.HTML;

import com.kbo.model.form.vo.ComponenteVO;
import com.kbo.model.form.vo.FormVO;
import com.kbo.model.form.vo.SeccionFormVO;
import com.kbo.model.util.Const;
import com.kbo.model.vo.PersonaVO;
import com.sun.faces.taglib.html_basic.PanelGroupTag;

/**
 * @author Giovanni
 *
 */
@ManagedBean(name="MbForm")
@ViewScoped 
public class MbForm implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4104683181334206385L;
	private FormVO formVO;
	private final String MODEL = "model" ;
	private final String VALUE = "value" ;
	private final String INIT_ID = "_";
	
	private TabView tabView;
	private Panel panel;
	private Object model;

    public Panel getPanel() {
    	panel = new Panel();
    	panel.setId("people");
    	panel.setWidgetVar(MODEL);
    	formVO = new FormVO("40");
    	PersonaVO persona = new PersonaVO();
    	persona.setPerNombre("Giovanni");
    	persona.setPerApe("de Jesus");
    	persona.setPerFNac(new Date());
    	persona.setPerEmail("kbo99.gio@gmail.com");
    	
    	setModel(persona);
    	
    	if (formVO != null) {
    		
    		Fieldset fielSet = null;
    		for (SeccionFormVO seccForm : formVO.getSeccionFormVO()) {
    			if (!seccForm.getValue().trim().equals("")) {
    				if (fielSet != null) {
    					panel.getChildren().add(fielSet);
    				}
    				fielSet = new Fieldset();
    				fielSet.setLegend(seccForm.getValue().trim());
    			}
    			if (fielSet == null) {
    	    		fielSet = new Fieldset();
    	    	}
    			fielSet.getChildren().add(builtSeccion(seccForm));
    		}
    		panel.getChildren().add(fielSet);
    	}
		return panel;
	}

    /**
     * Construlle los diferentes componentes que 
     * @param seccForm
     * @return
     */
    private PanelGrid builtSeccion(SeccionFormVO seccForm) {
    	PanelGrid panelGrid = new PanelGrid();
    	panelGrid.setColumns(seccForm.getListComponenteVO().size());
    	FacesContext context = FacesContext.getCurrentInstance();
    	for (ComponenteVO componenteVO : seccForm.getListComponenteVO()) {
    		PanelGrid pGroup = new PanelGrid();
    		Integer key = componenteVO.getComTpComponente();
    		UIComponent comp = null;
    		Class<?> tClass = null;
    		pGroup.setColumns(1);
    		if (!componenteVO.getComDesc().trim().equals("")) {
    			OutputLabel opl = new OutputLabel();
    			opl.setValue(componenteVO.getComDesc());
    			pGroup.getChildren().add(opl);
    		}
			if (key.equals(Const.TIPO_COMP_INPUT)) {
				InputText inp = new InputText();
				//inp.setValue(objModel + componenteVO.getBindingVO());
				inp.setId(INIT_ID + componenteVO.getComId().toString());
				inp.setLabel(componenteVO.getComDesc());
				tClass = String.class;
				inp.setStyle("style");
				comp = inp;
			} else if (key.equals(Const.TIPO_COMP_CALENDAR)) {
				Calendar cal = new Calendar();
				cal.setPattern("dd/MM/yyyy");
				cal.setMask("true");
				tClass = Date.class;
				comp = cal;
			} else if (key.equals(Const.TIPO_COMP_SELECT)) {
				
			} else if (key.equals(Const.TIPO_COMP_TEXT_AREA)) {
				
			}
			if (comp != null) {
				comp.setValueExpression(VALUE, context.getApplication().getExpressionFactory()
						.createValueExpression(context.getELContext(),
								"#{MbForm." + MODEL + "." + componenteVO.getBindingVO() + "}", tClass));
				pGroup.getChildren().add(comp);
				panelGrid.getChildren().add(pGroup);
			}
    	}
    	return panelGrid;
    }
	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public void setTabView(TabView tabView) {
        this.tabView = tabView;
    }

    public TabView getTabView() {
//        FacesContext fc = FacesContext.getCurrentInstance();
//        tabView = (TabView) fc.getApplication().createComponent("org.primefaces.component.TabView");

        // cargar la lista de objetos para tabview
        List liscaldimensional = new ArrayList();
        //liscaldimensional = ejbFacadeCalidadDimensional.findAll();
        tabView = new TabView();
        
        //Se crean dinamicamente las tabs y en su contenido, unas cajas de texto
        //for (CalidadDimensional sub : liscaldimensional) {
            Tab tab = new Tab();
            tab.setTitle("prueba");
           // Random randomGenerator = new Random();
            int total = 4;
            for (int i = 0; i < total; i++) {
                InputText inputtext = new InputText();
                inputtext.setLabel("Label" + i);
                inputtext.setValue("id:" + inputtext.getClientId());
                inputtext.setOnfocus("");
                tab.getChildren().add(inputtext);
            }
            tabView.getChildren().add(tab);
        //}
        return tabView;
    }

	/**
	 * @return the model
	 */
	public Object getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(Object model) {
		this.model = model;
	}


}
