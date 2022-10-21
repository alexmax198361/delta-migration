package com.disney.deltamigration.users.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "users")
@Data
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
   
    @Column(name = "first_name", nullable = true, length = 120)
    private String firstName;
    @Column(name = "last_name", nullable = true, length = 120)
    private String lastName;
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Column(name = "email_alt", nullable = true, length = 255)
    private String emailAlt;
    @Column(name = "username", nullable = true, length = 120)
    private String username;
    @Column(name = "password", nullable = true, length = 32)
    private String password;
    @Column(name = "phone_work", nullable = true, length = 120)
    private String phoneWork;
    @Column(name = "phone_mobile", nullable = true, length = 120)
    private String phoneMobile;
    @Column(name = "phone_alt", nullable = true, length = 120)
    private String phoneAlt;
    @Column(name = "department", nullable = true, length = 120)
    private String department;
    @Column(name = "location", nullable = true, length = 120)
    private String location;
    @Column(name = "room", nullable = true, length = 120)
    private String room;
    @Column(name = "timezone_offset", nullable = true)
    private Integer timezoneOffset;
    @Column(name = "ldap_id", nullable = true, length = 256)
    private String ldapId;
    @Column(name = "ad_id", nullable = true, length = 256)
    private String adId;
    @Column(name = "other_id", nullable = true, length = 256)
    private String otherId;
    @Column(name = "function", nullable = true, length = 120)
    private String function;
    @Column(name = "prepassetvideo", nullable = true)
    private Boolean prepassetvideo;
    @Column(name = "prepassetaudio", nullable = true)
    private Boolean prepassetaudio;
    @Column(name = "prepassetlir", nullable = true)
    private Boolean prepassetlir;
    @Column(name = "prepassettimedtext", nullable = true)
    private Boolean prepassettimedtext;
    @Column(name = "prepassettrailer", nullable = true)
    private Boolean prepassettrailer;
    @Column(name = "prepassetmetadata", nullable = true)
    private Boolean prepassetmetadata;
    @Column(name = "prepassetartwork", nullable = true)
    private Boolean prepassetartwork;
    @Column(name = "prepassetbonus", nullable = true)
    private Boolean prepassetbonus;
    @Column(name = "operator", nullable = true)
    private Boolean operator;
    @Column(name = "type", nullable = true)
    private Integer type;
    @Column(name = "hub_id", nullable = true, length = 256)
    private String hubId;

    @Column(name = "wmlsid", nullable = true, length = 255)
    private String wmlsid;

    @Column(name = "wmls_domain", nullable = true, length = 16)
    private String wmlsDomain;

    @Column(name = "stormid", nullable = true, length = 255)
    private String stormid;
    
    @Column(name = "template", nullable = true)
    private Integer template;
    
    @Column(name = "address1", nullable = true, length = 255)
    private String address1;
    
    @Column(name = "address2", nullable = true, length = 255)
    private String address2;
    
    @Column(name = "city", nullable = true, length = 255)
    private String city;
    
    @Column(name = "state", nullable = true, length = 255)
    private String state;
    
    @Column(name = "postalcode", nullable = true, length = 255)
    private String postalcode;
    
    @Column(name = "country", nullable = true, length = 255)
    private String country;
    
    @Column(name = "businessname", nullable = true, length = 255)
    private String businessname;
    
    @Column(name = "active", nullable = true)
    private Boolean active;
    
    @Column(name = "notes", nullable = true, length = 255)
    private String notes;
    
    @Column(name = "last_login", nullable = true)
    private Timestamp lastLogin;
    
    @Column(name = "business_approve", nullable = true)
    private Integer businessApprove;
    
    @Column(name = "technical_approve", nullable = true)
    private Integer technicalApprove;
    
    @Column(name = "contact_id", nullable = true)
    private Integer contactId;
    
    @Column(name = "tou_acceptance_date", nullable = true)
    private Timestamp touAcceptanceDate;
    
    @Column(name = "daily_digest_notification_timestamp", nullable = true)
    private Timestamp dailyDigestNotificationTimestamp;
    
    @Column(name = "session_alive", nullable = true)
    private Boolean sessionAlive;
    
    @Column(name = "google_auth_secret", nullable = true, length = 32)
    private String googleAuthSecret;
    
    @Column(name = "secret_expiration_date", nullable = true)
    private Timestamp secretExpirationDate;
    
    @Column(name = "google_authenticator_installed", nullable = true)
    private Boolean googleAuthenticatorInstalled;


}
