package main.Java.OOPS.gcr_codebase.Polymorphism;

class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void displayDetails() {
        System.out.println(
                "Member Name: "
                        + memberName
                        + ", Member ID: "
                        + memberId
        );
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Ritika", "S101"),
                new FacultyMember("Aman", "F201"),
                new GuestMember("Priya", "G301")
        };

        for (LibraryMember member : members) {

            member.displayDetails();

            System.out.println(
                    "Fine = "
                            + member.calculateFine(5)
            );

            System.out.println();
        }

        String searchId = "F201";

        for (LibraryMember member : members) {

            if (member.memberId.equals(searchId)) {

                System.out.println(
                        "Member Found: "
                                + member.memberName
                );
            }
        }
    }
}
