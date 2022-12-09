/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

/**
 *
 * @author athipathi
 */
public class Enterprise {
     private EnterpriseType enterpriseType;
     private String enterpriseName;

   

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }
    
    public enum EnterpriseType {
        EventDecor("EventDecor"), FoodManagement("FoodManagement"), Grooming("Grooming"), Finance("Finance");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public Enterprise(){}
    public Enterprise(String name, EnterpriseType type) {
        this.enterpriseName=name;
        this.enterpriseType = type;
        //organizationDirectory = new OrganizationDirectory();
    }

}
