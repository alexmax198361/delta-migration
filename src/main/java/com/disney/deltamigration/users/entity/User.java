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
    @Basic
    @Column(name = "first_name", nullable = true, length = 120)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = true, length = 120)
    private String lastName;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "email_alt", nullable = true, length = 255)
    private String emailAlt;
    @Basic
    @Column(name = "username", nullable = true, length = 120)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 32)
    private String password;
    @Basic
    @Column(name = "phone_work", nullable = true, length = 120)
    private String phoneWork;
    @Basic
    @Column(name = "phone_mobile", nullable = true, length = 120)
    private String phoneMobile;
    @Basic
    @Column(name = "phone_alt", nullable = true, length = 120)
    private String phoneAlt;
    @Basic
    @Column(name = "department", nullable = true, length = 120)
    private String department;
    @Basic
    @Column(name = "location", nullable = true, length = 120)
    private String location;
    @Basic
    @Column(name = "room", nullable = true, length = 120)
    private String room;
    @Basic
    @Column(name = "timezone_offset", nullable = true)
    private Integer timezoneOffset;
    @Basic
    @Column(name = "ldap_id", nullable = true, length = 256)
    private String ldapId;
    @Basic
    @Column(name = "ad_id", nullable = true, length = 256)
    private String adId;
    @Basic
    @Column(name = "other_id", nullable = true, length = 256)
    private String otherId;
    @Basic
    @Column(name = "function", nullable = true, length = 120)
    private String function;
    @Basic
    @Column(name = "prepassetvideo", nullable = true)
    private Boolean prepassetvideo;
    @Basic
    @Column(name = "prepassetaudio", nullable = true)
    private Boolean prepassetaudio;
    @Basic
    @Column(name = "prepassetlir", nullable = true)
    private Boolean prepassetlir;
    @Basic
    @Column(name = "prepassettimedtext", nullable = true)
    private Boolean prepassettimedtext;
    @Basic
    @Column(name = "prepassettrailer", nullable = true)
    private Boolean prepassettrailer;
    @Basic
    @Column(name = "prepassetmetadata", nullable = true)
    private Boolean prepassetmetadata;
    @Basic
    @Column(name = "prepassetartwork", nullable = true)
    private Boolean prepassetartwork;
    @Basic
    @Column(name = "prepassetbonus", nullable = true)
    private Boolean prepassetbonus;
    @Basic
    @Column(name = "operator", nullable = true)
    private Boolean operator;
    @Basic
    @Column(name = "type", nullable = true)
    private Integer type;
    @Basic
    @Column(name = "hub_id", nullable = true, length = 256)
    private String hubId;
    @Basic
    @Column(name = "wmlsid", nullable = true, length = 255)
    private String wmlsid;
    @Basic
    @Column(name = "wmls_domain", nullable = true, length = 16)
    private String wmlsDomain;
    @Basic
    @Column(name = "stormid", nullable = true, length = 255)
    private String stormid;
    @Basic
    @Column(name = "template", nullable = true)
    private Integer template;
    @Basic
    @Column(name = "address1", nullable = true, length = 255)
    private String address1;
    @Basic
    @Column(name = "address2", nullable = true, length = 255)
    private String address2;
    @Basic
    @Column(name = "city", nullable = true, length = 255)
    private String city;
    @Basic
    @Column(name = "state", nullable = true, length = 255)
    private String state;
    @Basic
    @Column(name = "postalcode", nullable = true, length = 255)
    private String postalcode;
    @Basic
    @Column(name = "country", nullable = true, length = 255)
    private String country;
    @Basic
    @Column(name = "businessname", nullable = true, length = 255)
    private String businessname;
    @Basic
    @Column(name = "active", nullable = true)
    private Boolean active;
    @Basic
    @Column(name = "notes", nullable = true, length = 255)
    private String notes;
    @Basic
    @Column(name = "last_login", nullable = true)
    private Timestamp lastLogin;
    @Basic
    @Column(name = "business_approve", nullable = true)
    private Integer businessApprove;
    @Basic
    @Column(name = "technical_approve", nullable = true)
    private Integer technicalApprove;
    @Basic
    @Column(name = "contact_id", nullable = true)
    private Integer contactId;
    @Basic
    @Column(name = "tou_acceptance_date", nullable = true)
    private Timestamp touAcceptanceDate;
    @Basic
    @Column(name = "daily_digest_notification_timestamp", nullable = true)
    private Timestamp dailyDigestNotificationTimestamp;
    @Basic
    @Column(name = "session_alive", nullable = true)
    private Boolean sessionAlive;
    @Basic
    @Column(name = "google_auth_secret", nullable = true, length = 32)
    private String googleAuthSecret;
    @Basic
    @Column(name = "secret_expiration_date", nullable = true)
    private Timestamp secretExpirationDate;
    @Basic
    @Column(name = "google_authenticator_installed", nullable = true)
    private Boolean googleAuthenticatorInstalled;


}
