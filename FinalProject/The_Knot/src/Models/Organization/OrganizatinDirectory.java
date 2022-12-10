/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Models.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class OrganizatinDirectory {
    private static long orgId = 100;
    private ArrayList<Organization> organizationList;

    public OrganizatinDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(String name, Type type) {
        Organization organization = null;
        long newOrgId = OrganizatinDirectory.orgId;
        if (type.getValue().equals(Type.Bakery.getValue())) {
            organization = new Bakery(name, type);
            organization.setId(newOrgId);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Catering.getValue())) {
            organization = new Catering(name, type);
            organization.setId(newOrgId);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Decor.getValue())) {
            organization = new Decor(name, type);
            organization.setId(newOrgId);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Designer.getValue())) {
            organization = new Designer(name, type);
            organization.setId(newOrgId);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Stylist.getValue())) {
            organization = new Stylist(name, type);
            organization.setId(newOrgId);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Venue.getValue())) {
            organization = new Venue(name, type);
            organization.setId(newOrgId);
            organizationList.add(organization);
        }
        OrganizatinDirectory.orgId++;
        return organization;

    }

    public boolean isUnique(String name) {
        for (Organization organization : organizationList) {
            if (name.equalsIgnoreCase(organization.getName())) {
                return false;
            }
        }
        return true;
    }
}
