package devf.b7actionbarandtoolbar.model;

/**
 * Created by Luis Galvan on 11/26/2015.
 */
public class Truck {


        private String mName;
        private int Age;
        private int Sex;
        private int mImageId;


        public Truck(String mName, int Age, int Sex, int mImageId){

            this.mName = mName;
            this.Age = Age;
            this.Sex = Sex;
            this.mImageId = mImageId;

        }

        public String getmName() {
            return mName;
        }

        public int getAge() {
            return Age;
        }

        public int getSex() {
            return Sex;
        }

        public int getmImageId() {
            return mImageId;
        }
    }
