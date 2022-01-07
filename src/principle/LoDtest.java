package principle;

import java.util.List;

/**
 * 迪米特法则
 * 定义是：只与你的直接朋友交谈，不跟“陌生人”说话。
 * 其含义是：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。
 * 其目的是降低类之间的耦合度，提高模块的相对独立性。
 */
public class LoDtest {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setmFans(new Fans("fans_1"));
        agent.setmCompany(new Company("company_1"));
        agent.setmStar(new Star("star_1"));
        agent.orderMeeting();
        agent.businiss();

    }
  static class Agent{
    private Star mStar;
    private Fans mFans;
    private Company mCompany;
      public void setmCompany(Company mCompany) {
          this.mCompany = mCompany;
      }

      public void setmFans(Fans mFans) {
          this.mFans = mFans;
      }

      public void setmStar(Star mStar) {
          this.mStar = mStar;
      }
    public void orderMeeting(){
        System.out.println(mStar.getName() +","+ mFans.getName());
    }
    public void businiss(){
           System.out.println(mStar.getName() +","+ mCompany.getName());
    }
   }
    static class Star{
        private String name;

        public Star(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    static class Fans{
        private String name;

        public Fans(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    static class Company{
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
