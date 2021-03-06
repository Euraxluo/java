package cn.euraxluo.passbook.merchants.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * merchants
 * cn.euraxluo.passbook.merchants.entity
 * Merchants
 * 2019/12/26 12:09
 * author:Euraxluo
 * TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {

    /** 商户 id, 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /** 商户名称, 需要是全局唯一的 */
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    /** 商户 logo */
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    /** 商户营业执照 */
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    /** 商户的联系电话 */
    @Column(name = "phone", nullable = false)
    private String phone;

    /** 商户地址 */
    @Column(name = "address", nullable = false)
    private String address;

    /** 商户是否通过审核 */
    @Column(name = "is_audit", nullable = false)
    private Boolean isAudit = false;
}
