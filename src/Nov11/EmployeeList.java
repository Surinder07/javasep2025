package Nov11;

import java.util.Objects;
import java.util.HashSet;



    public class EmployeeList {
        private String name;
        private String email;
        private int phone;

        public EmployeeList(String name, String email, int phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getPhone() {
            return phone;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            EmployeeList List = (EmployeeList) obj;
            return phone == List.phone &&
                    Objects.equals(name, List.name) &&
                    Objects.equals(email, List.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email, phone);
        }

        @Override
        public String toString() {
            return name + " (" + email + ", " + phone + ")";
        }

    }






