package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "delta_asset")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DeltaAsset {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "delta_asset_id")
    private Integer deltaAssetId;
    
    @Column(name = "delta_asset_uuid")
    private String deltaAssetUuid;
    
    @Column(name = "asset_video_id")
    private Integer assetVideoId;
    
    @Column(name = "asset_audio_id")
    private Integer assetAudioId;
    
    @Column(name = "asset_text_id")
    private Integer assetTextId;
    
    @Column(name = "asset_insert_id")
    private Integer assetInsertId;
    
    @Column(name = "asset_composite_id")
    private Integer assetCompositeId;
    
    @Column(name = "asset_art_id")
    private Integer assetArtId;
    
    @Column(name = "asset_dubcard_id")
    private Integer assetDubcardId;
    
    @Column(name = "asset_clip_id")
    private Integer assetClipId;
    
    @Column(name = "asset_clip_local_id")
    private Integer assetClipLocalId;
    
    @Column(name = "is_derivative")
    private Byte isDerivative;
    
    @Column(name = "derivative_type_id")
    private Integer derivativeTypeId;
    
    @Column(name = "asset_completed_date")
    private Timestamp assetCompletedDate;
    
    @Column(name = "asset_md5")
    private String assetMd5;


}
