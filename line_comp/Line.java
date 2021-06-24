package line_comp;
import java.util.*;

public class Line {
    Point p1, p2;
    
    @Override
    public int hashCode( ) {
    	return Objects.hash(p1, p2);
    }
    
    @Override
    public boolean equals(Object obj) {
    	/*if (this == obj)
    	     return true;
    	  if(obj == null)
    	     return false;
    	  if(getClass() = obj.getclass())
    	     return false;
    	  Line other = (Line) obj;
    	  return objects.equals(p1, other.p1) && object.equals(p2,other.p2);
    	 */
    
  
    return this.getLength() == ((Line)obj).getLength();
    }    
    public double getLength() {
    	return Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));
	
		

	}

}
