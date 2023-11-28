package FRQ.Y2021.Q3;

public class ClubMembersSimulator {

    public static void main(String[] args) {
        MemberInfo member1 = new MemberInfo("SMITH, JANE", 2019, false);
        MemberInfo member2 = new MemberInfo("FOX, STEVE", 2018, true);
        MemberInfo member3 = new MemberInfo("XIN, MICHAEL", 2017, false);
        MemberInfo member4 = new MemberInfo("GARCIA, MARIA", 2020, true);

        ClubMembers club1 = new ClubMembers();
        String[] names2019 = new String[] {"SMITH, JANE"};
        String[] names2018 = new String[] {"FOX, STEVE"};
        String[] names2017 = new String[] {"XIN, MICHAEL"};
        String[] names2020 = new String[] {"GARCIA, MARIA"};

//        club1.addMembers(names2019, 2019);
//        club1.addMembers(names2018, 2018);
//        club1.addMembers(names2017, 2017);
//        club1.addMembers(names2020, 2020);

//        getMemberList
        System.out.println(club1.getMemberList().size());


    }



}
