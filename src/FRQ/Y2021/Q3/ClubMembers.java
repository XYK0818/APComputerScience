package FRQ.Y2021.Q3;

import java.util.ArrayList;

public class ClubMembers {

    private ArrayList<MemberInfo> memberList;

    public ArrayList<MemberInfo> getMemberList(){
        return memberList;
    }

    public void addMembers(String[] names, int gradYear){
        for(String name: names){
            this.memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> goodStanding = new ArrayList<MemberInfo>();

        int i = 0;
        while (i < memberList.size()){
            if(memberList.get(i).getGradYear() <= year){
                MemberInfo removed = memberList.remove(i);
                if(removed.inGoodStanding()){
                    goodStanding.add(removed);
                }
            } else {
                i++;
            }
        }
        return goodStanding;
    }


}
