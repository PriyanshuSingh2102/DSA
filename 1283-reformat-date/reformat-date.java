class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        String day = parts[0].substring(0, parts[0].length() - 2);
        if (day.length() == 1) {
            day = "0" + day;
        }
        String month = "";
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(parts[1])) {
                month = (i + 1 < 10) ? "0" + (i + 1) : "" + (i + 1);
                break;
            }
        }
        String year = parts[2];

        return year + "-" + month + "-" + day;
    }
}