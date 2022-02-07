package shipment.activity.transformer.json;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;

public class ShipmentActivity {

  @Getter @Setter long shipmentId;
  @Getter @Setter String shipmentNumber;
  @Getter @Setter String shipmentOriginCompany;
  @Getter @Setter String foreignShipmentNumber;
  @Getter @Setter int pieces;
  @Getter @Setter String updateCompany;
  @Getter @Setter String piNumber;
  @Getter @Setter String problemCode;
  @Getter @Setter String comment1;
  @Getter @Setter String comment2;
  @Getter @Setter String actionDate;
  @Getter @Setter String entryDate;
  @Getter @Setter String userId;
  @Getter @Setter long branchId;

  @Getter @Setter Geo geo;
  @Getter @Setter String source;
  @Getter @Setter ShipmentDetails shipmentDetails;

  @Getter @Setter Mawb mawb;

  @Getter @Setter Item[] items;

  public static class Item {
    @Getter @Setter long id;
    @Getter @Setter long itemNumber;
    @Getter @Setter long commodityNo;
    @Getter @Setter String description;
    @Getter @Setter long pieces;
    @Getter @Setter double customsValue;
    @Getter @Setter double chargableWeight;
    @Getter @Setter String packing;
  }

  public static class ShipmentDetails {

    @Getter @Setter String shipmentNumber;
    @Getter @Setter String shipmentOriginCompany;
    @Getter @Setter String productType;
    @Getter @Setter String shipmentDestinationCompany;
    @Getter @Setter String foreignShipmentNumber;
    @Getter @Setter String services;
    @Getter @Setter boolean skeleton;
    @Getter @Setter String pickupDate;
    @Getter @Setter String receivedAt;
    @Getter @Setter int pieces;
    @Getter @Setter double shipmentWeight;
    @Getter @Setter double chargeableWeight;
    @Getter @Setter String shipmentWeightUnit;
    @Getter @Setter String paymentType;
    @Getter @Setter double collectAmount;
    @Getter @Setter String collectCurrencyCode;
    @Getter @Setter double customsAmount;
    @Getter @Setter String customsCurrencyCode;
    @Getter @Setter String commodityCountryCode;
    @Getter @Setter String commodityDescription;
    @Getter @Setter String billingAccountNumber;
    @Getter @Setter long sourceId;
    @Getter @Setter String shipmentRemarks;
    @Getter @Setter double cashValue;
    @Getter @Setter String cashCurrencyCode;
    @Getter @Setter double insuranceValue;
    @Getter @Setter String insuranceCurrencyCode;
    @Getter @Setter double codValue;
    @Getter @Setter String codCurrencyCode;
    @Getter @Setter String paymentOption;
    @Getter @Setter String srnNumber;
    @Getter @Setter String shipmentProductGroup;
    @Getter @Setter String shipmentRef1;
    @Getter @Setter String shipmentRef2;
    @Getter @Setter String shipmentRef3;
    @Getter @Setter String shipmentAlertedBy;
    @Getter @Setter String shipmentAlertedDate;
    @Getter @Setter String dueDate;
    @Getter @Setter String collectionReference;
    @Getter @Setter double cube;
    @Getter @Setter String cubeUnit;
    @Getter @Setter String accountingInformation;
    @Getter @Setter long prepaidRangeId;

    @Getter @Setter ShipmentDimensions shipmentDimensions;
    @Getter @Setter JsonNode additionalProperties;

    @Getter @Setter Shipper shipper;
    @Getter @Setter Receiver receiver;
    @Getter @Setter ThirdParty thirdParty;
  }

  public static class Mawb {

    @Getter @Setter String carrier;
    @Getter @Setter String originPoint;
    @Getter @Setter String mawbNumber;
    @Getter @Setter String destinationPort;
    @Getter @Setter int originEntity;
    @Getter @Setter String destinationEntity;
    @Getter @Setter String flt1Carrier;
    @Getter @Setter String flt1Number;
    @Getter @Setter String flt1Etd;
    @Getter @Setter String flt1Eta;
    @Getter @Setter String via1;
    @Getter @Setter String flt2Carrier;
    @Getter @Setter String flt2Number;
    @Getter @Setter String flt2Etd;
    @Getter @Setter String flt2Eta;
    @Getter @Setter String via2;
    @Getter @Setter String flt3Carrier;
    @Getter @Setter String flt3Number;
    @Getter @Setter String flt3Etd;
    @Getter @Setter String flt3Eta;
    @Getter @Setter String netEta;
    @Getter @Setter int motherBags;
    @Getter @Setter int babyBags;
    @Getter @Setter double mawbWeight;
    @Getter @Setter String mawbWeighUnit;
    @Getter @Setter String remarks;
    @Getter @Setter String originEntityCode;
    @Getter @Setter String destinationEntityCode;
    @Getter @Setter boolean mawbRecoveryNotRequired;
    @Getter @Setter String mawbContainerNumber;
    @Getter @Setter String finalizedDate;
    @Getter @Setter long contractfltGrpsId;
    @Getter @Setter long srrId;
    @Getter @Setter long mawbId;

    @Getter @Setter String closeDate;
    @Getter @Setter String status;
    @Getter @Setter long originBranch;
    @Getter @Setter long destinationBranch;
  }

  public static class Geo {

    @Getter @Setter String type;
    @Getter @Setter double[] coordinates;

  }

  public static class ShipmentDimensions {

    @Getter @Setter Dim dim;

    public static class Dim {

      @Getter @Setter int wf;
      @Getter @Setter String wu;
      @Getter @Setter String[] p;
      @Getter @Setter String[] l;
      @Getter @Setter String[] w;
      @Getter @Setter String[] h;
      @Getter @Setter String[] gw;
      @Getter @Setter String[] vw;
      @Getter @Setter String[] cw;
    }
  }


  public static class Shipper {
    @Getter @Setter String number;
    @Getter @Setter String reference;
    @Getter @Setter String reference2;
    @Getter @Setter String name;
    @Getter @Setter String sentBy;
    @Getter @Setter String address;
    @Getter @Setter String address2;
    @Getter @Setter String telephone;
    @Getter @Setter String city;
    @Getter @Setter String stateCode;
    @Getter @Setter String zipCode;
    @Getter @Setter String countryCode;
    @Getter @Setter long id;
    @Getter @Setter long teamId;
    @Getter @Setter String fax;
    @Getter @Setter String email;
    @Getter @Setter String mobile;
    @Getter @Setter String originLocationCode;
  }

  public static class ThirdParty {

    @Getter @Setter String number;
    @Getter @Setter String reference;
    @Getter @Setter String reference2;
    @Getter @Setter String name;
    @Getter @Setter String contact;
    @Getter @Setter String address;
    @Getter @Setter String address2;
    @Getter @Setter String telephone;
    @Getter @Setter String city;
    @Getter @Setter String stateCode;
    @Getter @Setter String zipCode;
    @Getter @Setter String countryCode;
    @Getter @Setter long id;
    @Getter @Setter long teamId;
    @Getter @Setter String company;
  }

  public static class Receiver {

    @Getter @Setter String shipmentDestinationCompany;
    @Getter @Setter String number;
    @Getter @Setter String reference;
    @Getter @Setter String name;
    @Getter @Setter String attentionOf;
    @Getter @Setter String address;
    @Getter @Setter String address2;
    @Getter @Setter String telephone;
    @Getter @Setter String telephone2;
    @Getter @Setter String city;
    @Getter @Setter String stateCode;
    @Getter @Setter String zipCode;
    @Getter @Setter String countryCode;
    @Getter @Setter long id;
    @Getter @Setter long teamId;
    @Getter @Setter String reference2;
    @Getter @Setter String fax;
    @Getter @Setter String email;
    @Getter @Setter String destinationLocationCode;
    @Getter @Setter String mobile;
  }
}
