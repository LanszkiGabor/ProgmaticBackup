package _1107_Valasztasok;

public class Election {

    private int electionDistrict;
    private int countedVotes;
    private String firstName;
    private String lastName;
    private String party;

    public Election(int electionDistrict, int countedVotes, String firstName, String lastName, String party) {
        this.electionDistrict = electionDistrict;
        this.countedVotes = countedVotes;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
    }

    public int getElectionDistrict() {
        return electionDistrict;
    }

    public void setElectionDistrict(int electionDistrict) {
        this.electionDistrict = electionDistrict;
    }

    public int getCountedVotes() {
        return countedVotes;
    }

    public void setCountedVotes(int countedVotes) {
        this.countedVotes = countedVotes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
}

