
/**
 * <h1>OCD data class</h1>
 * Problem description of a business case or problem analysis.
 * @author geert
 * 
 */
public class ocd_data {
	/**
	 * Describes the problem that needs solving.
	 */
    private String _problemDescription;
    /**
     * Describes the current method and how the problem manifest itself.
     */
    private String _currentSituation;
    /**
     * Describes the approach from a business requirement point of view.
     */
    private String _rationaleForChange;
    /**
     * Describes how the problem can be solved.
     */
    private String _systemConcept;
    /**
     * Describes how the intended system will work in the clients organisation.
     */
    private String _relevantOperationalScenarios;
    /**
     * Describes the impact of the change in the clients organisation.
     */
    private String _impact;
    /**
     * Describes the advantages, disadvantages and restrictions that occur when the change is made.
     */
    private String _advantages;
    
    /**
     * @return the description of the problem that needs solving. 
     */
    public String getProblemDescription(){
    	return _problemDescription;
    }
    /**
     * Set the description of the problem that needs solving.
     * @param value describes the problem that needs solving.
     */
    public void setProblemDescription(String value){
    	_problemDescription = value;
    }

    /**
     * @return the description of the current method and how the problem manifest itself.
     */
    public String getCurrentSituation(){
    	return _currentSituation;
    }
    /**
     * Set the description of the current method and how the problem manifest itself.
     * @param value describes the current method and how the problem manifest itself.
     */
    public void setCurrentSituation(String value){
    	_currentSituation = value;
    }
}
