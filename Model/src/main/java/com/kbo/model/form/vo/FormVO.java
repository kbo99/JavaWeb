/**
 * 
 */
package com.kbo.model.form.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Giovanni
 *
 */
public class FormVO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4287132456653327578L;
	private Integer frmId;
	private String frmDescripcion;
	private List<SeccionFormVO> seccionFormVO;
	
	public FormVO(int iter) {
		frmDescripcion = "Prueba1";
		seccionFormVO = new ArrayList<>();
		int id = 0;
		for (int i = 0; i < iter ; i++) {
			SeccionFormVO secFor = new SeccionFormVO();
			if (i % 5 == 0) {
				secFor.setValue("prueba" + i);
			}
			secFor.setListComponenteVO(new ArrayList<ComponenteVO>());
			for (int j = 0; j < 5; j++) {
				ComponenteVO compVO = new ComponenteVO();
				compVO.setBindingVO("persona");
				compVO.setComDesc("label " + j);
				compVO.setComId(++id);
				compVO.setComTpComponente(1);
				compVO.setRequerid(j % 2 == 0 ? "true" : "false");
				secFor.getListComponenteVO().add(compVO);
			}
			seccionFormVO.add(secFor);
		}
	}
	public FormVO(String p) {
		frmDescripcion = "Prueba1";
		seccionFormVO = new ArrayList<>();
		SeccionFormVO secFor = new SeccionFormVO();
		secFor.setValue("Datos Persona");
		secFor.setListComponenteVO(new ArrayList<ComponenteVO>());
		int id = 0;
		
		ComponenteVO compVO = new ComponenteVO();
		compVO.setBindingVO("perNombre");
		compVO.setComDesc("Nombre(s): ");
		compVO.setComId(++id);
		compVO.setComTpComponente(1);
		compVO.setRequerid("true");
		secFor.getListComponenteVO().add(compVO);
		
		compVO = new ComponenteVO();
		compVO.setBindingVO("perApe");
		compVO.setComDesc("Apellido: ");
		compVO.setComId(++id);
		compVO.setComTpComponente(1);
		compVO.setRequerid("true");
		secFor.getListComponenteVO().add(compVO);
		
		seccionFormVO.add(secFor);
		secFor = new SeccionFormVO();
		secFor.setListComponenteVO(new ArrayList<ComponenteVO>());
		
		compVO = new ComponenteVO();
		compVO.setBindingVO("perFNac");
		compVO.setComDesc("Fecha de Nacimiento; ");
		compVO.setComId(++id);
		compVO.setComTpComponente(2);
		compVO.setRequerid("true");
		secFor.getListComponenteVO().add(compVO);
		
		
		compVO = new ComponenteVO();
		compVO.setBindingVO("perEmail");
		compVO.setComDesc("E-mail: ");
		compVO.setComId(++id);
		compVO.setComTpComponente(1);
		compVO.setRequerid("true");
		secFor.getListComponenteVO().add(compVO);
		
		seccionFormVO.add(secFor);
	}
	
	/**
	 * @return the frmId
	 */
	public Integer getFrmId() {
		return frmId;
	}
	/**
	 * @param frmId the frmId to set
	 */
	public void setFrmId(Integer frmId) {
		this.frmId = frmId;
	}
	/**
	 * @return the frmDescripcion
	 */
	public String getFrmDescripcion() {
		return frmDescripcion;
	}
	/**
	 * @param frmDescripcion the frmDescripcion to set
	 */
	public void setFrmDescripcion(String frmDescripcion) {
		this.frmDescripcion = frmDescripcion;
	}
	/**
	 * @return the seccionFormVO
	 */
	public List<SeccionFormVO> getSeccionFormVO() {
		return seccionFormVO;
	}
	/**
	 * @param seccionFormVO the seccionFormVO to set
	 */
	public void setSeccionFormVO(List<SeccionFormVO> seccionFormVO) {
		this.seccionFormVO = seccionFormVO;
	}
	
	
}
