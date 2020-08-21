public class ComputerBuilder {

    public static void main(String[] args) {
        ComputerPart[] partList = new ComputerPart[6];
        partList[0] = new ComputerPart("memory card", 349.99);
        partList[1] = new ComputerPart("motherboard", 19.99);
        partList[2] = new ComputerPart("power supply", 19.99);
        partList[3] = new ComputerPart("hard drive", 19.99);
        partList[4] = new ComputerPart("CPU", 19.99);
        partList[5] = new ComputerPart("fan", 19.99);
        try {
            System.out.print(buildToaster(partList));
        } catch (BadPartException e) {
            e.printStackTrace();
        } catch (MissingPartException s) {
            s.printStackTrace();
        }
        System.out.print(listSpecifications(partList));



        // System.out.print(buildOfficeMachine());
    }

    public static String buildOfficeMachine(ComputerPart[] partList) throws BadPartException, MissingPartException {
        if (partList.length != 6) {
            throw new MissingPartException("NOT FOUND");
        }
        if (partList[partList.length - 1].getModel() != "") {
            throw new BadPartException("ERROR");
        }

        return listSpecifications(partList);
    }

    public static String buildGamingRig(ComputerPart[] partList) throws BadPartException, MissingPartException {
        if (partList.length != 6) {
            throw new MissingPartException("NOT FOUND");
        }
        if (partList[partList.length - 1].getModel() == "") {
            throw new BadPartException("ERROR");
        }

        return listSpecifications(partList);
    }

    public static String buildToaster(ComputerPart[] partList) throws BadPartException, MissingPartException {
        if (partList.length != 6) {
            throw new MissingPartException("NOT FOUND");
        }
        double totalCost = 0;
        for (int i = 0; i < partList.length; i++) {
            totalCost = totalCost + partList[i].getCost();
        }
        if (totalCost > 400) {
            throw new BadPartException("ERROR");
        }

        return listSpecifications(partList);
    }


    public static String listSpecifications(ComputerPart[] partList)  {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < partList.length; i++) {
            builder.append("Part #" + (i) + ":" + "\n");
            builder.append(partList[i].toString() + "\n");
        }
        return builder.toString();
    }
}
