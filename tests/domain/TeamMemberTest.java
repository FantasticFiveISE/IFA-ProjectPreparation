package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamMemberTest {

    Field field;
    TeamOwner owner;
    Team team;
    TeamMember TM;

    @BeforeEach
    public void init(){
        field = new Field("test",100);
        owner = new TeamOwner("ownerUser","owner@gmail.com");
        team = new Team("test",field,owner);
        TM = new TeamManager("teamManagerUser","man@gmail.com");
    }

    @AfterEach
    public void finish(){
        field = null;
        owner = null;
        team =  null;
        TM = null;
    }

    @Test
    void setCurrentTeam() {
        assertNull(TM.getCurrentTeam());
        TM.setCurrentTeam(team.getTeamName());
        assertEquals(team, TM.getCurrentTeam());
    }


}