package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

// TODO: Implemente la clase
public class Segment {
	
	private double length;
	private double angle;
	private List<Segment> children;
	
	/**constructor de un segmento con longitud, angulo respecto al padre y segmentos hijos
	 * 
	 * @param length
	 * @param angle
	 */
	public Segment(double length, double angle) {
		this.length=length;
		this.angle=angle;
		this.children=new ArrayList<>();
	}
	
	/**devuelve la longitud del segmento
	 * 
	 * @return
	 */
	public double getLength() {
		return length;
	}
	
	/**devuelve el angulo del segmento respecto al padre
	 * 
	 * @return
	 */
	public double getAngle() {
		return angle;
	}
	
	/**impone un nuevo algulo respecto al padre
	 * 
	 * @param angle
	 * @return
	 */
	public double setAngle(double angle) {
		return this.angle=angle;
	}
	
	/**devuelve los segmentos hijos del segmento
	 * 
	 * @return
	 */
	public List<Segment> getChildren(){
		return children;
	}
	
	/**añade un segmento hijo. solo una vez
	 * 
	 * @param child
	 */
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}
	}

}
