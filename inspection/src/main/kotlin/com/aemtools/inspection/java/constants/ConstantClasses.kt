package com.aemtools.inspection.java.constants

/**
 * @author Dmytro Troynikov
 */
@Suppress("MayBeConstant", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")
object ConstantClasses {

  /*
   * Reduced list of AEM constants
   */

//  val JACKRABIT_JCR_CONSTANTS: String = "org.apache.jackrabbit.JcrConstants"
//  val CQ_COMMONS_JCR_JCR_CONSTANTS: String = "com.day.cq.commons.jcr.JcrConstants"
//  val DAY_CRX_JCR_CONSTANTS: String = "com.day.crx.JcrConstants"
//  val DAM_CONSTANTS: String = "com.day.cq.dam.api.DamConstants"
//  val NAME_CONSTANTS: String = "com.day.cq.wcm.api.NameConstants"
//  val CONFIGURATION_CONSTANTS: String = "com.day.cq.wcm.webservicesupport.ConfigurationConstants"
//  val JCR_RESOURCE_CONSTANTS: String = "org.apache.sling.jcr.resource.JcrResourceConstants"
//  val TAG_CONSTANTS: String = "com.day.cq.tagging.TagConstants"
//  val REPLICATION_STATUS: String = "com.day.cq.replication.ReplicationStatus"
//  val JCR_PACKAGE: String = "org.apache.jackrabbit.vault.packaging.JcrPackage"
//  val JCR_PACKAGE_DEFINITION: String = "org.apache.jackrabbit.vault.packaging.JcrPackageDefinition"
//  val RESOURCE_RESOLVER_FACTORY: String = "org.apache.sling.api.resource.ResourceResolverFactory"
//  val WORKFLOW_EVENT: String = "com.adobe.granite.workflow.event.WorkflowEvent"
//  val SLING_CONSTANTS: String = "org.apache.sling.api.SlingConstants"
//  val HTTP_CONSTANTS: String = "org.apache.sling.api.servlets.HttpConstants"
//  val OSGI_CONSTANTS: String = "org.osgi.framework.Constants"
//  val ENGINE_CONSTANTS: String = "org.apache.sling.engine.EngineConstants"
  
  /*
   * List of all AEM 6.4 constant classes
   */

  val CH_RANDELSHOFER_MEDIA_JPEG_JFIFINPUTSTREAM: String = "ch.randelshofer.media.jpeg.JFIFInputStream"
  val COM_ADOBE_CQ_ADDRESS_API_ADDRESS: String = "com.adobe.cq.address.api.Address"
  val COM_ADOBE_CQ_ADDRESS_API_LOCATION_LOCATION: String = "com.adobe.cq.address.api.location.Location"
  val COM_ADOBE_CQ_CLOUDSERVICES_PROVISIONING_PROVISIONINGHANDLER: String = "com.adobe.cq.cloudservices.provisioning.ProvisioningHandler"
  val COM_ADOBE_CQ_CLOUDSERVICES_PROVISIONING_PROVISIONINGPROPERTIES: String = "com.adobe.cq.cloudservices.provisioning.ProvisioningProperties"
  val COM_ADOBE_CQ_COMMERCE_API_COMMERCECONSTANTS: String = "com.adobe.cq.commerce.api.CommerceConstants"
  val COM_ADOBE_CQ_COMMERCE_API_COMMERCEQUERY: String = "com.adobe.cq.commerce.api.CommerceQuery"
  val COM_ADOBE_CQ_COMMERCE_API_COMMERCESERVICEFACTORY: String = "com.adobe.cq.commerce.api.CommerceServiceFactory"
  val COM_ADOBE_CQ_COMMERCE_API_COMMERCESESSION: String = "com.adobe.cq.commerce.api.CommerceSession"
  val COM_ADOBE_CQ_COMMERCE_API_PRICEINFO: String = "com.adobe.cq.commerce.api.PriceInfo"
  val COM_ADOBE_CQ_COMMERCE_API_PRODUCT: String = "com.adobe.cq.commerce.api.Product"
  val COM_ADOBE_CQ_COMMERCE_API_PRODUCTRELATIONSHIPSPROVIDER: String = "com.adobe.cq.commerce.api.ProductRelationshipsProvider"
  val COM_ADOBE_CQ_COMMERCE_API_PROMOTION_PROMOTION: String = "com.adobe.cq.commerce.api.promotion.Promotion"
  val COM_ADOBE_CQ_COMMERCE_API_PROMOTION_PROMOTIONHANDLER: String = "com.adobe.cq.commerce.api.promotion.PromotionHandler"
  val COM_ADOBE_CQ_COMMERCE_COMMON_COMMERCESEARCHPROVIDER: String = "com.adobe.cq.commerce.common.CommerceSearchProvider"
  val COM_ADOBE_CQ_COMMERCE_COMMON_COOKIEUTIL: String = "com.adobe.cq.commerce.common.CookieUtil"
  val COM_ADOBE_CQ_COMMERCE_COMMON_FACETPARAMHELPER: String = "com.adobe.cq.commerce.common.FacetParamHelper"
  val COM_ADOBE_CQ_COMMERCE_COMMON_PRICEFILTER: String = "com.adobe.cq.commerce.common.PriceFilter"
  val COM_ADOBE_CQ_COMMERCE_COMMON_PROMOTION_ABSTRACTJCRVOUCHER: String = "com.adobe.cq.commerce.common.promotion.AbstractJcrVoucher"
  val COM_ADOBE_CQ_COMMERCE_PIM_API_CATALOGBLUEPRINTIMPORTER: String = "com.adobe.cq.commerce.pim.api.CatalogBlueprintImporter"
  val COM_ADOBE_CQ_COMMERCE_PIM_API_CATALOGGENERATOR: String = "com.adobe.cq.commerce.pim.api.CatalogGenerator"
  val COM_ADOBE_CQ_COMMERCE_PIM_API_PRODUCTIMPORTER: String = "com.adobe.cq.commerce.pim.api.ProductImporter"
  val COM_ADOBE_CQ_COMMERCE_PIM_COMMON_ABSTRACTIMPORTER: String = "com.adobe.cq.commerce.pim.common.AbstractImporter"
  val COM_ADOBE_CQ_COMMERCE_PIM_COMMON_ABSTRACTPRODUCTIMPORTER: String = "com.adobe.cq.commerce.pim.common.AbstractProductImporter"
  val COM_ADOBE_CQ_DAM_CFM_BASICDATATYPE: String = "com.adobe.cq.dam.cfm.BasicDataType"
  val COM_ADOBE_CQ_EXPORT_JSON_EXPORTERCONSTANTS: String = "com.adobe.cq.export.json.ExporterConstants"
  val COM_ADOBE_CQ_MCM_CAMPAIGN_CONSTANTS: String = "com.adobe.cq.mcm.campaign.Constants"
  val COM_ADOBE_CQ_MCM_SALESFORCE_SALESFORCECLIENT: String = "com.adobe.cq.mcm.salesforce.SalesforceClient"
  val COM_ADOBE_CQ_MCM_SALESFORCE_SALESFORCEEXPORTPROCESS: String = "com.adobe.cq.mcm.salesforce.SalesforceExportProcess"
  val COM_ADOBE_CQ_MCM_SALESFORCE_SALESFORCELEADSEARCH: String = "com.adobe.cq.mcm.salesforce.SalesforceLeadSearch"
  val COM_ADOBE_CQ_SCHEDULED_EXPORTER_EXPORTER: String = "com.adobe.cq.scheduled.exporter.Exporter"
  val COM_ADOBE_CQ_SCHEDULED_EXPORTER_SCHEDULEDEXPORTER: String = "com.adobe.cq.scheduled.exporter.ScheduledExporter"
  val COM_ADOBE_CQ_SCHEDULED_EXPORTER_PROCESS_EXTRACTEXPORTDATAPROCESS: String = "com.adobe.cq.scheduled.exporter.process.ExtractExportDataProcess"
  val COM_ADOBE_CQ_SCREENS_BINDING_DEVICECONSTANTS: String = "com.adobe.cq.screens.binding.DeviceConstants"
  val COM_ADOBE_CQ_SCREENS_BINDING_DEVICECONSTANTS_COMMANDS: String = "com.adobe.cq.screens.binding.DeviceConstants.Commands"
  val COM_ADOBE_CQ_SCREENS_BINDING_SCREENSCONSTANTS: String = "com.adobe.cq.screens.binding.ScreensConstants"
  val COM_ADOBE_CQ_SCREENS_IMPL_AEMIO_SCREENSMODELLOOKUP: String = "com.adobe.cq.screens.impl.aemio.ScreensModelLookup"
  val COM_ADOBE_CQ_SIGHTLY_WCMBINDINGS: String = "com.adobe.cq.sightly.WCMBindings"
  val COM_ADOBE_CQ_SIGHTLY_WCMRESOURCEOPTIONS: String = "com.adobe.cq.sightly.WCMResourceOptions"
  val COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_API_SOCIALACTIVITYEVENTCONSTANTS: String = "com.adobe.cq.social.activitystreams.api.SocialActivityEventConstants"
  val COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_API_SOCIALJSONCONSTANTS: String = "com.adobe.cq.social.activitystreams.api.SocialJsonConstants"
  val COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_LISTENER_API_ACTIVITYSTREAMPROVIDER: String = "com.adobe.cq.social.activitystreams.listener.api.ActivityStreamProvider"
  val COM_ADOBE_CQ_SOCIAL_BADGING_API_BADGINGSERVICE: String = "com.adobe.cq.social.badging.api.BadgingService"
  val COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_API_CALENDAR: String = "com.adobe.cq.social.calendar.client.api.Calendar"
  val COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_API_CALENDARACTIONSEVENT: String = "com.adobe.cq.social.calendar.client.api.CalendarActionsEvent"
  val COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_ENDPOINTS_CALENDARREQUESTCONSTANTS: String = "com.adobe.cq.social.calendar.client.endpoints.CalendarRequestConstants"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_API_COMMENT: String = "com.adobe.cq.social.commons.comments.api.Comment"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_API_COMMENTCOLLECTIONCONFIGURATION: String = "com.adobe.cq.social.commons.comments.api.CommentCollectionConfiguration"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_ENDPOINTS_ABSTRACTCOMMENTOPERATIONSERVICE: String = "com.adobe.cq.social.commons.comments.endpoints.AbstractCommentOperationService"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_LISTING_COMMENTSOCIALCOMPONENTLIST: String = "com.adobe.cq.social.commons.comments.listing.CommentSocialComponentList"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_SEARCH_SEARCHCOMPONENT: String = "com.adobe.cq.social.commons.comments.search.SearchComponent"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_SEARCH_SEARCHRESULTCOMPONENT: String = "com.adobe.cq.social.commons.comments.search.SearchResultComponent"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_COMMENTEMAILBUILDER: String = "com.adobe.cq.social.commons.emailreply.CommentEmailBuilder"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_EMAILCLIENTPROVIDER: String = "com.adobe.cq.social.commons.emailreply.EmailClientProvider"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_EMAILREPLYCONSTANTS: String = "com.adobe.cq.social.commons.emailreply.EmailReplyConstants"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_EVENTS_COMMENTEVENT: String = "com.adobe.cq.social.commons.events.CommentEvent"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_LISTING_QUERYFILTERUTIL: String = "com.adobe.cq.social.commons.listing.QueryFilterUtil"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_API_ABSTRACTMODERATIONOPERATION: String = "com.adobe.cq.social.commons.moderation.api.AbstractModerationOperation"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_API_MODERATIONOPERATIONEXTENSION: String = "com.adobe.cq.social.commons.moderation.api.ModerationOperationExtension"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_API_MODERATIONOPERATIONS: String = "com.adobe.cq.social.commons.moderation.api.ModerationOperations"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_EVENTS_MODERATIONEVENT: String = "com.adobe.cq.social.commons.moderation.events.ModerationEvent"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_TAGCLOUD_API_TAGCLOUD: String = "com.adobe.cq.social.commons.tagcloud.api.TagCloud"
  val COM_ADOBE_CQ_SOCIAL_COMMONS_TAGCLOUD_API_TAGCLOUDTAG: String = "com.adobe.cq.social.commons.tagcloud.api.TagCloudTag"
  val COM_ADOBE_CQ_SOCIAL_COMMUNITY_API_COMMUNITYCONSTANTS: String = "com.adobe.cq.social.community.api.CommunityConstants"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_GROUP_API_ENABLEMENTGROUPCOLLECTION: String = "com.adobe.cq.social.enablement.group.api.EnablementGroupCollection"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHMODEL: String = "com.adobe.cq.social.enablement.learningpath.model.api.EnablementLearningPathModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHPREREQUISITE: String = "com.adobe.cq.social.enablement.learningpath.model.api.EnablementLearningPathPrerequisite"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHRESOURCE: String = "com.adobe.cq.social.enablement.learningpath.model.api.EnablementLearningPathResource"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHRESOURCES: String = "com.adobe.cq.social.enablement.learningpath.model.api.EnablementLearningPathResources"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHRATINGREPORT: String = "com.adobe.cq.social.enablement.learningpath.reporting.api.EnablementLearningPathRatingReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHRESOURCEREPORT: String = "com.adobe.cq.social.enablement.learningpath.reporting.api.EnablementLearningPathResourceReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHUSERCOMPLETIONREPORT: String = "com.adobe.cq.social.enablement.learningpath.reporting.api.EnablementLearningPathUserCompletionReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHUSERDETAILREPORT: String = "com.adobe.cq.social.enablement.learningpath.reporting.api.EnablementLearningPathUserDetailReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHUSERENROLLMENTREPORT: String = "com.adobe.cq.social.enablement.learningpath.reporting.api.EnablementLearningPathUserEnrollmentReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_REPORTING_MODEL_API_ENABLEMENTRESOURCEAGGREGATEREPORTMODEL: String = "com.adobe.cq.social.enablement.reporting.model.api.EnablementResourceAggregateReportModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_REPORTING_MODEL_API_ENABLEMENTRESOURCEREPORTMODEL: String = "com.adobe.cq.social.enablement.reporting.model.api.EnablementResourceReportModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_REPORTING_MODEL_API_ENABLEMENTRESOURCEUSERREPORTMODEL: String = "com.adobe.cq.social.enablement.reporting.model.api.EnablementResourceUserReportModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTASSETMODEL: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementAssetModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTASSETSMODEL: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementAssetsModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLE: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementAuthorizable"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLEGROUP: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementAuthorizableGroup"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLES: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementAuthorizables"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLEUSER: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementAuthorizableUser"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTCARDIMAGE: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementCardImage"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTRESOURCEMODEL: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementResourceModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTRESOURCEMODELLIST: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementResourceModelList"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTRESOURCEREPORT: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementResourceReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTSOCIALCOMPONENT: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementSocialComponent"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTSOCIALMODEL: String = "com.adobe.cq.social.enablement.resource.model.api.EnablementSocialModel"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTREPORTGROUPENROLLMENTLIST: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementReportGroupEnrollmentList"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEANALYTICSREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceAnalyticsReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEASSIGNMENTSTATUS: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceAssignmentStatus"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEENROLLMENTREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceEnrollmentReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEENROLLMENTSTATUSREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceEnrollmentStatusReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCERATINGSREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceRatingsReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCETRENDREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceTrendReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEVIDEOCLIENTREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceVideoClientReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEVIDEODROPOFFREPORT: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceVideoDropoffReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEVIDEOTRACKING: String = "com.adobe.cq.social.enablement.resource.reporting.api.EnablementResourceVideoTracking"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_API_ENABLEMENTSITE: String = "com.adobe.cq.social.enablement.site.api.EnablementSite"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_API_ENABLEMENTSITECATALOG: String = "com.adobe.cq.social.enablement.site.api.EnablementSiteCatalog"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_API_ENABLEMENTSITECOLLECTION: String = "com.adobe.cq.social.enablement.site.api.EnablementSiteCollection"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_REPORTING_API_ENABLEMENTAGGREGATERESOURCERATINGREPORT: String = "com.adobe.cq.social.enablement.site.reporting.api.EnablementAggregateResourceRatingReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_REPORTING_API_ENABLEMENTAGGREGATERESOURCEREPORT: String = "com.adobe.cq.social.enablement.site.reporting.api.EnablementAggregateResourceReport"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_REPORTING_API_ENABLEMENTREPORTUSERENROLLMENTLIST: String = "com.adobe.cq.social.enablement.site.reporting.api.EnablementReportUserEnrollmentList"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_USER_API_ENABLEMENTCOMMUNITYSIMPLEUSER: String = "com.adobe.cq.social.enablement.user.api.EnablementCommunitySimpleUser"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTLEARNINGPATHVIEW: String = "com.adobe.cq.social.enablement.view.api.EnablementLearningPathView"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTLEARNINGPATHVIEWDETAIL: String = "com.adobe.cq.social.enablement.view.api.EnablementLearningPathViewDetail"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTRESOURCEVIEW: String = "com.adobe.cq.social.enablement.view.api.EnablementResourceView"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTRESOURCEVIEWDETAIL: String = "com.adobe.cq.social.enablement.view.api.EnablementResourceViewDetail"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTSITEASSIGNMENTSVIEW: String = "com.adobe.cq.social.enablement.view.api.EnablementSiteAssignmentsView"
  val COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTSITECATALOGVIEW: String = "com.adobe.cq.social.enablement.view.api.EnablementSiteCatalogView"
  val COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_ASSET: String = "com.adobe.cq.social.filelibrary.client.api.Asset"
  val COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_FILELIBRARY: String = "com.adobe.cq.social.filelibrary.client.api.FileLibrary"
  val COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_FILELIBRARYCONFIGURATION: String = "com.adobe.cq.social.filelibrary.client.api.FileLibraryConfiguration"
  val COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_FILELIBRARYEVENT: String = "com.adobe.cq.social.filelibrary.client.api.FileLibraryEvent"
  val COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_ENDPOINTS_FILELIBRARYDOWNLOADGETSERVLET: String = "com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet"
  val COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_FORUM: String = "com.adobe.cq.social.forum.client.api.Forum"
  val COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_FORUMCONFIGURATION: String = "com.adobe.cq.social.forum.client.api.ForumConfiguration"
  val COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_FORUMEVENT: String = "com.adobe.cq.social.forum.client.api.ForumEvent"
  val COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_POST: String = "com.adobe.cq.social.forum.client.api.Post"
  val COM_ADOBE_CQ_SOCIAL_GRAPH_EDGE: String = "com.adobe.cq.social.graph.Edge"
  val COM_ADOBE_CQ_SOCIAL_GRAPH_CLIENT_API_FOLLOWING: String = "com.adobe.cq.social.graph.client.api.Following"
  val COM_ADOBE_CQ_SOCIAL_GRAPH_CLIENT_API_RELATIONSHIPCOLLECTION: String = "com.adobe.cq.social.graph.client.api.RelationshipCollection"
  val COM_ADOBE_CQ_SOCIAL_GROUP_API_GROUPCONSTANTS: String = "com.adobe.cq.social.group.api.GroupConstants"
  val COM_ADOBE_CQ_SOCIAL_GROUP_API_GROUPSERVICE: String = "com.adobe.cq.social.group.api.GroupService"
  val COM_ADOBE_CQ_SOCIAL_GROUP_API_GROUPUTIL: String = "com.adobe.cq.social.group.api.GroupUtil"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUP: String = "com.adobe.cq.social.group.client.api.CommunityGroup"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPCOLLECTION: String = "com.adobe.cq.social.group.client.api.CommunityGroupCollection"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPCONSTANTS: String = "com.adobe.cq.social.group.client.api.CommunityGroupConstants"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPFOLDER: String = "com.adobe.cq.social.group.client.api.CommunityGroupFolder"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPMEMBERLISTCOMPONENT: String = "com.adobe.cq.social.group.client.api.CommunityGroupMemberListComponent"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPUSER: String = "com.adobe.cq.social.group.client.api.CommunityGroupUser"
  val COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_ENDPOINTS_ABSTRACTCOMMUNITYGROUPOPERATIONSERVICE: String = "com.adobe.cq.social.group.client.endpoints.AbstractCommunityGroupOperationService"
  val COM_ADOBE_CQ_SOCIAL_HANDLEBARS_API_TEMPLATECONTEXTPROVIDER: String = "com.adobe.cq.social.handlebars.api.TemplateContextProvider"
  val COM_ADOBE_CQ_SOCIAL_HANDLEBARS_API_TEMPLATEHELPER: String = "com.adobe.cq.social.handlebars.api.TemplateHelper"
  val COM_ADOBE_CQ_SOCIAL_HANDLEBARS_API_TEMPLATEHELPERSSERVICE: String = "com.adobe.cq.social.handlebars.api.TemplateHelpersService"
  val COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_API_IDEACOMMENT: String = "com.adobe.cq.social.ideation.client.api.IdeaComment"
  val COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_API_IDEATION: String = "com.adobe.cq.social.ideation.client.api.Ideation"
  val COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_API_IDEATIONEVENT: String = "com.adobe.cq.social.ideation.client.api.IdeationEvent"
  val COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNAL: String = "com.adobe.cq.social.journal.client.api.Journal"
  val COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNALENTRYCOMMENT: String = "com.adobe.cq.social.journal.client.api.JournalEntryComment"
  val COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNALEVENT: String = "com.adobe.cq.social.journal.client.api.JournalEvent"
  val COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNALSIDEBAR: String = "com.adobe.cq.social.journal.client.api.JournalSidebar"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUP: String = "com.adobe.cq.social.members.api.CommunityMemberGroup"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUPCOLLECTION: String = "com.adobe.cq.social.members.api.CommunityMemberGroupCollection"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUPMEMBERS: String = "com.adobe.cq.social.members.api.CommunityMemberGroupMembers"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUPPROFILE: String = "com.adobe.cq.social.members.api.CommunityMemberGroupProfile"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERUSER: String = "com.adobe.cq.social.members.api.CommunityMemberUser"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERUSERCOLLECTION: String = "com.adobe.cq.social.members.api.CommunityMemberUserCollection"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERUSERPROFILE: String = "com.adobe.cq.social.members.api.CommunityMemberUserProfile"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_COMMUNITYMEMBERGROUPPROFILEOPERATIONS: String = "com.adobe.cq.social.members.endpoints.CommunityMemberGroupProfileOperations"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_COMMUNITYMEMBERSTUNNELVALIDATOR: String = "com.adobe.cq.social.members.endpoints.CommunityMembersTunnelValidator"
  val COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_COMMUNITYMEMBERUSERPROFILEOPERATIONS: String = "com.adobe.cq.social.members.endpoints.CommunityMemberUserProfileOperations"
  val COM_ADOBE_CQ_SOCIAL_MESSAGING_API_MESSAGINGSOCIALEVENT: String = "com.adobe.cq.social.messaging.api.MessagingSocialEvent"
  val COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_API_MESSAGEBOXSOCIALCOMPONENT: String = "com.adobe.cq.social.messaging.client.api.MessageBoxSocialComponent"
  val COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_API_MESSAGESOCIALCOMPONENT: String = "com.adobe.cq.social.messaging.client.api.MessageSocialComponent"
  val COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_API_MESSAGINGUSER: String = "com.adobe.cq.social.messaging.client.api.MessagingUser"
  val COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_ENDPOINTS_MESSAGINGOPERATIONS: String = "com.adobe.cq.social.messaging.client.endpoints.MessagingOperations"
  val COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_COMMUNITIESCONTENTFRAGMENT: String = "com.adobe.cq.social.moderation.dashboard.api.CommunitiesContentFragment"
  val COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_FILTERGROUP: String = "com.adobe.cq.social.moderation.dashboard.api.FilterGroup"
  val COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_FILTERGROUPSOCIALCOMPONENTFACTORY: String = "com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory"
  val COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_MODERATIONDASHBOARD: String = "com.adobe.cq.social.moderation.dashboard.api.ModerationDashboard"
  val COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_USERDETAILS: String = "com.adobe.cq.social.moderation.dashboard.api.UserDetails"
  val COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_API_NOTIFICATIONCONSTANTS: String = "com.adobe.cq.social.notifications.api.NotificationConstants"
  val COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CHANNEL_CHANNEL: String = "com.adobe.cq.social.notifications.channel.Channel"
  val COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CHANNEL_CHANNELEXTENSION: String = "com.adobe.cq.social.notifications.channel.ChannelExtension"
  val COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CLIENT_API_SOCIALNOTIFICATION: String = "com.adobe.cq.social.notifications.client.api.SocialNotification"
  val COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CLIENT_API_SOCIALNOTIFICATIONCOLLECTION: String = "com.adobe.cq.social.notifications.client.api.SocialNotificationCollection"
  val COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_API_QNAEVENT: String = "com.adobe.cq.social.qna.client.api.QnaEvent"
  val COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_API_QNAPOST: String = "com.adobe.cq.social.qna.client.api.QnaPost"
  val COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_API_QNAPOSTCOLLECTION: String = "com.adobe.cq.social.qna.client.api.QnaPostCollection"
  val COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSCOMMUNITYACTIVITY: String = "com.adobe.cq.social.reporting.analytics.api.AnalyticsCommunityActivity"
  val COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSCOMMUNITYACTIVITYCOLLECTION: String = "com.adobe.cq.social.reporting.analytics.api.AnalyticsCommunityActivityCollection"
  val COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSCOMPONENTCOLLECTION: String = "com.adobe.cq.social.reporting.analytics.api.AnalyticsComponentCollection"
  val COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSFRAMEWORKCOLLECTION: String = "com.adobe.cq.social.reporting.analytics.api.AnalyticsFrameworkCollection"
  val COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_SITETRENDREPORT: String = "com.adobe.cq.social.reporting.analytics.api.SiteTrendReport"
  val COM_ADOBE_CQ_SOCIAL_REVIEW_CLIENT_API_REVIEWCONSTANTS: String = "com.adobe.cq.social.review.client.api.ReviewConstants"
  val COM_ADOBE_CQ_SOCIAL_REVIEW_CLIENT_API_REVIEWEVENT: String = "com.adobe.cq.social.review.client.api.ReviewEvent"
  val COM_ADOBE_CQ_SOCIAL_SCF_CLIENTUTILITIES: String = "com.adobe.cq.social.scf.ClientUtilities"
  val COM_ADOBE_CQ_SOCIAL_SCF_COLLECTIONPAGINATION: String = "com.adobe.cq.social.scf.CollectionPagination"
  val COM_ADOBE_CQ_SOCIAL_SCF_OPERATIONEXTENSION: String = "com.adobe.cq.social.scf.OperationExtension"
  val COM_ADOBE_CQ_SOCIAL_SCF_QUERYREQUESTINFO: String = "com.adobe.cq.social.scf.QueryRequestInfo"
  val COM_ADOBE_CQ_SOCIAL_SCF_SOCIALCOMPONENT: String = "com.adobe.cq.social.scf.SocialComponent"
  val COM_ADOBE_CQ_SOCIAL_SCF_SOCIALGROUP: String = "com.adobe.cq.social.scf.SocialGroup"
  val COM_ADOBE_CQ_SOCIAL_SCF_USER: String = "com.adobe.cq.social.scf.User"
  val COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYAUTHORIZABLECOLLECTION: String = "com.adobe.cq.social.scf.community.CommunityAuthorizableCollection"
  val COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYSIMPLEAUTHORIZABLECOLLECTION: String = "com.adobe.cq.social.scf.community.CommunitySimpleAuthorizableCollection"
  val COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYSITETRANSLATIONCONSTANTS: String = "com.adobe.cq.social.scf.community.CommunitySiteTranslationConstants"
  val COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYUSER: String = "com.adobe.cq.social.scf.community.CommunityUser"
  val COM_ADOBE_CQ_SOCIAL_SCF_CORE_SOCIALEVENT: String = "com.adobe.cq.social.scf.core.SocialEvent"
  val COM_ADOBE_CQ_SOCIAL_SCF_UTILITIES_INTERNAL_INTERNALSCFUTILITIES: String = "com.adobe.cq.social.scf.utilities.internal.InternalSCFUtilities"
  val COM_ADOBE_CQ_SOCIAL_SCORING_API_SCORINGCONSTANTS: String = "com.adobe.cq.social.scoring.api.ScoringConstants"
  val COM_ADOBE_CQ_SOCIAL_SRP_APICOMMAND: String = "com.adobe.cq.social.srp.APICommand"
  val COM_ADOBE_CQ_SOCIAL_SRP_FACETRANGEFIELD: String = "com.adobe.cq.social.srp.FacetRangeField"
  val COM_ADOBE_CQ_SOCIAL_SRP_SOCIALRESOURCEPROVIDER: String = "com.adobe.cq.social.srp.SocialResourceProvider"
  val COM_ADOBE_CQ_SOCIAL_SRP_CONFIG_DSRPCONFIGURATION: String = "com.adobe.cq.social.srp.config.DSRPConfiguration"
  val COM_ADOBE_CQ_SOCIAL_SRP_CONFIG_MSRPCONFIGURATION: String = "com.adobe.cq.social.srp.config.MSRPConfiguration"
  val COM_ADOBE_CQ_SOCIAL_SRP_CONFIG_SOCIALRESOURCECONFIGURATION: String = "com.adobe.cq.social.srp.config.SocialResourceConfiguration"
  val COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_ABSTRACTCACHE: String = "com.adobe.cq.social.srp.internal.AbstractCache"
  val COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_ABSTRACTSCHEMAMAPPER: String = "com.adobe.cq.social.srp.internal.AbstractSchemaMapper"
  val COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_CACHINGRESOURCEPROVIDER: String = "com.adobe.cq.social.srp.internal.CachingResourceProvider"
  val COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_ERRORRESULT: String = "com.adobe.cq.social.srp.internal.ErrorResult"
  val COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_SOCIALINDEXER: String = "com.adobe.cq.social.srp.internal.SocialIndexer"
  val COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_SOCIALRESOURCEUTILS: String = "com.adobe.cq.social.srp.internal.SocialResourceUtils"
  val COM_ADOBE_CQ_SOCIAL_SRP_UTILITIES_INTERNAL_INTERNALSOCIALRESOURCEUTILITIES: String = "com.adobe.cq.social.srp.utilities.internal.InternalSocialResourceUtilities"
  val COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_API_SUBSCRIPTION: String = "com.adobe.cq.social.subscriptions.api.Subscription"
  val COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_CLIENT_API_SUBSCRIPTIONCOLLECTION: String = "com.adobe.cq.social.subscriptions.client.api.SubscriptionCollection"
  val COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_CLIENT_API_USERSUBSCRIPTIONPREFERENCES: String = "com.adobe.cq.social.subscriptions.client.api.UserSubscriptionPreferences"
  val COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_ENDPOINT_SUBSCRIPTIONCOLLECTIONOPERATIONS: String = "com.adobe.cq.social.subscriptions.endpoint.SubscriptionCollectionOperations"
  val COM_ADOBE_CQ_SOCIAL_TALLY_LIKING: String = "com.adobe.cq.social.tally.Liking"
  val COM_ADOBE_CQ_SOCIAL_TALLY_POLL: String = "com.adobe.cq.social.tally.Poll"
  val COM_ADOBE_CQ_SOCIAL_TALLY_TALLYCONSTANTS: String = "com.adobe.cq.social.tally.TallyConstants"
  val COM_ADOBE_CQ_SOCIAL_TALLY_VOTING: String = "com.adobe.cq.social.tally.Voting"
  val COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_LIKINGSOCIALCOMPONENT: String = "com.adobe.cq.social.tally.client.api.LikingSocialComponent"
  val COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_RATINGSOCIALCOMPONENT: String = "com.adobe.cq.social.tally.client.api.RatingSocialComponent"
  val COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_TALLYEVENT: String = "com.adobe.cq.social.tally.client.api.TallyEvent"
  val COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_VOTINGSOCIALCOMPONENT: String = "com.adobe.cq.social.tally.client.api.VotingSocialComponent"
  val COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_ENDPOINTS_TALLYOPERATIONSSERVICE: String = "com.adobe.cq.social.tally.client.endpoints.TallyOperationsService"
  val COM_ADOBE_CQ_SOCIAL_UGC_API_ABSTRACTUGCNODEINDEXEREXTENSION: String = "com.adobe.cq.social.ugc.api.AbstractUgcNodeIndexerExtension"
  val COM_ADOBE_CQ_SOCIAL_UGC_API_UGCFILTER: String = "com.adobe.cq.social.ugc.api.UgcFilter"
  val COM_ADOBE_CQ_SOCIAL_UGCBASE_COLLABUSER: String = "com.adobe.cq.social.ugcbase.CollabUser"
  val COM_ADOBE_CQ_SOCIAL_UGCBASE_SOCIALUTILS: String = "com.adobe.cq.social.ugcbase.SocialUtils"
  val COM_ADOBE_CQ_SOCIAL_UGCBASE_CORE_SOCIALRESOURCEUTILS: String = "com.adobe.cq.social.ugcbase.core.SocialResourceUtils"
  val COM_ADOBE_CQ_SOCIAL_UGCBASE_SECURITY_ATTACHMENTTYPEBLACKLISTSERVICE: String = "com.adobe.cq.social.ugcbase.security.AttachmentTypeBlacklistService"
  val COM_ADOBE_CQ_SOCIAL_UGCBASE_SECURITY_SAFERSLINGPOSTVALIDATOR: String = "com.adobe.cq.social.ugcbase.security.SaferSlingPostValidator"
  val COM_ADOBE_CQ_UPGRADES_BACKUP_BACKUPCONSTANTS: String = "com.adobe.cq.upgrades.backup.BackupConstants"
  val COM_ADOBE_CQ_UPGRADESEXECUTOR_ACTIVATOR: String = "com.adobe.cq.upgradesexecutor.Activator"
  val COM_ADOBE_CQ_XF_EXPERIENCEFRAGMENTSCONSTANTS: String = "com.adobe.cq.xf.ExperienceFragmentsConstants"
  val COM_ADOBE_CQ_XF_UI_EXPERIENCEFRAGMENTDATASOURCE: String = "com.adobe.cq.xf.ui.ExperienceFragmentDatasource"
  val COM_ADOBE_DAM_PRINT_IDS_STRINGCONSTANTS: String = "com.adobe.dam.print.ids.StringConstants"
  val COM_ADOBE_GRANITE_ACTIVITYSTREAMS_ACTIVITYEVENTCONSTANTS: String = "com.adobe.granite.activitystreams.ActivityEventConstants"
  val COM_ADOBE_GRANITE_ACTIVITYSTREAMS_JSONCONSTANTS: String = "com.adobe.granite.activitystreams.JsonConstants"
  val COM_ADOBE_GRANITE_ACTIVITYSTREAMS_OBJECTTYPES: String = "com.adobe.granite.activitystreams.ObjectTypes"
  val COM_ADOBE_GRANITE_ACTIVITYSTREAMS_VERBS: String = "com.adobe.granite.activitystreams.Verbs"
  val COM_ADOBE_GRANITE_ASSET_API_RENDITIONHANDLER: String = "com.adobe.granite.asset.api.RenditionHandler"
  val COM_ADOBE_GRANITE_AUTH_OAUTH_ACCESSTOKENPROVIDERCONSTANTS: String = "com.adobe.granite.auth.oauth.AccessTokenProviderConstants"
  val COM_ADOBE_GRANITE_AUTH_OAUTH_ACCESSTOKENREQUESTCUSTOMIZER: String = "com.adobe.granite.auth.oauth.AccessTokenRequestCustomizer"
  val COM_ADOBE_GRANITE_AUTH_OAUTH_CREDENTIALSVALIDATOR: String = "com.adobe.granite.auth.oauth.CredentialsValidator"
  val COM_ADOBE_GRANITE_AUTH_OAUTH_OAUTHCONSTANTS: String = "com.adobe.granite.auth.oauth.OAuthConstants"
  val COM_ADOBE_GRANITE_AUTH_OAUTH_PROVIDERCONFIGPROPERTIES: String = "com.adobe.granite.auth.oauth.ProviderConfigProperties"
  val COM_ADOBE_GRANITE_AUTH_OAUTH_TOKENVALIDATOR: String = "com.adobe.granite.auth.oauth.TokenValidator"
  val COM_ADOBE_GRANITE_AUTH_SAML_MODEL_SAMLCONSTANTS: String = "com.adobe.granite.auth.saml.model.SamlConstants"
  val COM_ADOBE_GRANITE_AUTH_SAML_MODEL_XML_SAMLXMLCONSTANTS: String = "com.adobe.granite.auth.saml.model.xml.SamlXmlConstants"
  val COM_ADOBE_GRANITE_AUTH_SAML_UTIL_SAMLWRITER: String = "com.adobe.granite.auth.saml.util.SamlWriter"
  val COM_ADOBE_GRANITE_CLOUDSETTINGS_CLOUDSETTINGSUTIL: String = "com.adobe.granite.cloudsettings.CloudSettingsUtil"
  val COM_ADOBE_GRANITE_COMMENTS_ABSTRACTCOMMENTINGPROVIDER: String = "com.adobe.granite.comments.AbstractCommentingProvider"
  val COM_ADOBE_GRANITE_COMMENTS_COMMENTINGEVENT: String = "com.adobe.granite.comments.CommentingEvent"
  val COM_ADOBE_GRANITE_COMMENTS_COMMENTINGPROVIDER: String = "com.adobe.granite.comments.CommentingProvider"
  val COM_ADOBE_GRANITE_CONFMGR_CONFCONSTANTS: String = "com.adobe.granite.confmgr.ConfConstants"
  val COM_ADOBE_GRANITE_CRYPTO_CRYPTOSUPPORT: String = "com.adobe.granite.crypto.CryptoSupport"
  val COM_ADOBE_GRANITE_CRYPTO_SPI_KEYPROVIDER: String = "com.adobe.granite.crypto.spi.KeyProvider"
  val COM_ADOBE_GRANITE_HAF_CONVERTER_API_CONVERTERCONTEXT: String = "com.adobe.granite.haf.converter.api.ConverterContext"
  val COM_ADOBE_GRANITE_HAF_CONVERTER_API_HYPERMEDIACONVERTER: String = "com.adobe.granite.haf.converter.api.HypermediaConverter"
  val COM_ADOBE_GRANITE_HAF_CONVERTER_PLATFORM_API_PLATFORMCONVERTERSERVICE: String = "com.adobe.granite.haf.converter.platform.api.PlatformConverterService"
  val COM_ADOBE_GRANITE_KEYSTORE_KEYSTORESERVICE: String = "com.adobe.granite.keystore.KeyStoreService"
  val COM_ADOBE_GRANITE_LICENSE_LICENSE: String = "com.adobe.granite.license.License"
  val COM_ADOBE_GRANITE_MAINTENANCE_MAINTENANCECONSTANTS: String = "com.adobe.granite.maintenance.MaintenanceConstants"
  val COM_ADOBE_GRANITE_OAUTH_JWT_JWTCONSTANTS: String = "com.adobe.granite.oauth.jwt.JwtConstants"
  val COM_ADOBE_GRANITE_OMNISEARCH_API_CORE_OMNISEARCHSERVICE: String = "com.adobe.granite.omnisearch.api.core.OmniSearchService"
  val COM_ADOBE_GRANITE_OMNISEARCH_COMMONS_ABSTRACTOMNISEARCHHANDLER: String = "com.adobe.granite.omnisearch.commons.AbstractOmniSearchHandler"
  val COM_ADOBE_GRANITE_OPERATIONS_OPERATIONSSERVICE: String = "com.adobe.granite.operations.OperationsService"
  val COM_ADOBE_GRANITE_REST_APIRESOURCEPROVIDERFACTORY: String = "com.adobe.granite.rest.ApiResourceProviderFactory"
  val COM_ADOBE_GRANITE_REST_CONSTANTS: String = "com.adobe.granite.rest.Constants"
  val COM_ADOBE_GRANITE_REST_CONVERTER_RESOURCECONVERTERCONTEXT: String = "com.adobe.granite.rest.converter.ResourceConverterContext"
  val COM_ADOBE_GRANITE_REST_CONVERTER_SIREN_ABSTRACTSIRENCONVERTER: String = "com.adobe.granite.rest.converter.siren.AbstractSirenConverter"
  val COM_ADOBE_GRANITE_REST_FILTER_FILTERFACTORY: String = "com.adobe.granite.rest.filter.FilterFactory"
  val COM_ADOBE_GRANITE_SECURITY_USER_SSLCONFIGURATIONSERVICE: String = "com.adobe.granite.security.user.SSLConfigurationService"
  val COM_ADOBE_GRANITE_SECURITY_USER_USERPROPERTIES: String = "com.adobe.granite.security.user.UserProperties"
  val COM_ADOBE_GRANITE_SECURITY_USER_USERPROPERTIESMANAGER: String = "com.adobe.granite.security.user.UserPropertiesManager"
  val COM_ADOBE_GRANITE_SECURITY_USER_USERPROPERTIESSERVICE: String = "com.adobe.granite.security.user.UserPropertiesService"
  val COM_ADOBE_GRANITE_SECURITY_USER_UTIL_PROPCONSTANTS: String = "com.adobe.granite.security.user.util.PropConstants"
  val COM_ADOBE_GRANITE_SOCKETIO_SOCKETIONAMESPACE: String = "com.adobe.granite.socketio.SocketIONamespace"
  val COM_ADOBE_GRANITE_TASKMANAGEMENT_TASK: String = "com.adobe.granite.taskmanagement.Task"
  val COM_ADOBE_GRANITE_TASKMANAGEMENT_TASKEVENT: String = "com.adobe.granite.taskmanagement.TaskEvent"
  val COM_ADOBE_GRANITE_TRANSLATION_API_TRANSLATIONCONFIG: String = "com.adobe.granite.translation.api.TranslationConfig"
  val COM_ADOBE_GRANITE_TRANSLATION_API_TRANSLATIONCONSTANTS_TRANSLATIONRELATIONSHIPS: String = "com.adobe.granite.translation.api.TranslationConstants.TranslationRelationShips"
  val COM_ADOBE_GRANITE_TRANSLATION_API_TRANSLATIONSERVICEFACTORY: String = "com.adobe.granite.translation.api.TranslationServiceFactory"
  val COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_MICROSOFTTRANSLATIONCLOUDCONFIG: String = "com.adobe.granite.translation.connector.msft.core.MicrosoftTranslationCloudConfig"
  val COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_UI_UTILS_MICROSOFTCLOUDSERVICEUTILS: String = "com.adobe.granite.translation.connector.msft.core.ui.utils.MicrosoftCloudServiceUtils"
  val COM_ADOBE_GRANITE_TRANSLATION_CORE_MACHINETRANSLATIONCLOUDCONFIG: String = "com.adobe.granite.translation.core.MachineTranslationCloudConfig"
  val COM_ADOBE_GRANITE_UI_CLIENTLIBS_HTMLLIBRARYMANAGER: String = "com.adobe.granite.ui.clientlibs.HtmlLibraryManager"
  val COM_ADOBE_GRANITE_UI_CLIENTLIBS_SCRIPT_SCRIPTPROCESSOR: String = "com.adobe.granite.ui.clientlibs.script.ScriptProcessor"
  val COM_ADOBE_GRANITE_UI_COMPONENTS_VALUE: String = "com.adobe.granite.ui.components.Value"
  val COM_ADOBE_GRANITE_WORKFLOW_PAYLOADMAP: String = "com.adobe.granite.workflow.PayloadMap"
  val COM_ADOBE_GRANITE_WORKFLOW_COLLECTION_RESOURCECOLLECTION: String = "com.adobe.granite.workflow.collection.ResourceCollection"
  val COM_ADOBE_GRANITE_WORKFLOW_EVENT_WORKFLOWEVENT: String = "com.adobe.granite.workflow.event.WorkflowEvent"
  val COM_ADOBE_GRANITE_WORKFLOW_EXEC_PARTICIPANTSTEPCHOOSER: String = "com.adobe.granite.workflow.exec.ParticipantStepChooser"
  val COM_ADOBE_GRANITE_WORKFLOW_JOB_ABSOLUTETIMEOUTHANDLER: String = "com.adobe.granite.workflow.job.AbsoluteTimeoutHandler"
  val COM_ADOBE_GRANITE_WORKFLOW_JOB_EXTERNALPROCESSJOB: String = "com.adobe.granite.workflow.job.ExternalProcessJob"
  val COM_ADOBE_GRANITE_WORKFLOW_JOB_TIMEOUTJOB: String = "com.adobe.granite.workflow.job.TimeoutJob"
  val COM_ADOBE_GRANITE_WORKFLOW_JOB_WORKFLOWJOB: String = "com.adobe.granite.workflow.job.WorkflowJob"
  val COM_ADOBE_GRANITE_WORKFLOW_MODEL_WORKFLOWMODELSERIALIZER: String = "com.adobe.granite.workflow.model.WorkflowModelSerializer"
  val COM_ADOBE_GRANITE_WORKFLOW_MODEL_WORKFLOWNODE: String = "com.adobe.granite.workflow.model.WorkflowNode"
  val COM_ADOBE_GRANITE_XSS_JSONUTIL: String = "com.adobe.granite.xss.JSONUtil"
  val COM_ADOBE_INTERNAL_XMP_XMPCONST: String = "com.adobe.internal.xmp.XMPConst"
  val COM_ADOBE_INTERNAL_XMP_XMPERROR: String = "com.adobe.internal.xmp.XMPError"
  val COM_ADOBE_INTERNAL_XMP_OPTIONS_ALIASOPTIONS: String = "com.adobe.internal.xmp.options.AliasOptions"
  val COM_ADOBE_INTERNAL_XMP_OPTIONS_ITERATOROPTIONS: String = "com.adobe.internal.xmp.options.IteratorOptions"
  val COM_ADOBE_INTERNAL_XMP_OPTIONS_PARSEOPTIONS: String = "com.adobe.internal.xmp.options.ParseOptions"
  val COM_ADOBE_INTERNAL_XMP_OPTIONS_PROPERTYOPTIONS: String = "com.adobe.internal.xmp.options.PropertyOptions"
  val COM_ADOBE_INTERNAL_XMP_OPTIONS_SERIALIZEOPTIONS: String = "com.adobe.internal.xmp.options.SerializeOptions"
  val COM_ADOBE_INTERNAL_XMP_OPTIONS_TEMPLATEOPTIONS: String = "com.adobe.internal.xmp.options.TemplateOptions"
  val COM_ADOBE_SOCIAL_INTEGRATIONS_LIVEFYRE_CONFIG_API_LIVEFYRECONFIGPROVIDER: String = "com.adobe.social.integrations.livefyre.config.api.LivefyreConfigProvider"
  val COM_ADOBE_SOCIAL_INTEGRATIONS_LIVEFYRE_USER_API_PINGFORPULLUSER: String = "com.adobe.social.integrations.livefyre.user.api.PingForPullUser"
  val COM_ADOBE_VERSIONCUE_NATIVECOMM_IO_ISERIALIZER: String = "com.adobe.versioncue.nativecomm.io.ISerializer"
  val COM_ADOBE_VERSIONCUE_NATIVECOMM_MSG_NCTYPE: String = "com.adobe.versioncue.nativecomm.msg.NCType"
  val COM_ADOBE_XMP_XMPCONST: String = "com.adobe.xmp.XMPConst"
  val COM_ADOBE_XMP_XMPERROR: String = "com.adobe.xmp.XMPError"
  val COM_ADOBE_XMP_CORE_NAMESPACE_ADOBEPDF: String = "com.adobe.xmp.core.namespace.AdobePDF"
  val COM_ADOBE_XMP_CORE_NAMESPACE_CAMERARAW: String = "com.adobe.xmp.core.namespace.CameraRaw"
  val COM_ADOBE_XMP_CORE_NAMESPACE_DUBLINCORE: String = "com.adobe.xmp.core.namespace.DublinCore"
  val COM_ADOBE_XMP_CORE_NAMESPACE_EXIFSCHEMAFORADDITIONALEXIF: String = "com.adobe.xmp.core.namespace.EXIFSchemaForAdditionalEXIF"
  val COM_ADOBE_XMP_CORE_NAMESPACE_EXIFSCHEMAFOREXIF: String = "com.adobe.xmp.core.namespace.EXIFSchemaForEXIF"
  val COM_ADOBE_XMP_CORE_NAMESPACE_EXIFSCHEMAFORTIFF: String = "com.adobe.xmp.core.namespace.EXIFSchemaForTIFF"
  val COM_ADOBE_XMP_CORE_NAMESPACE_PHOTOSHOP: String = "com.adobe.xmp.core.namespace.Photoshop"
  val COM_ADOBE_XMP_CORE_NAMESPACE_RDF: String = "com.adobe.xmp.core.namespace.RDF"
  val COM_ADOBE_XMP_CORE_NAMESPACE_RESOURCEEVENT: String = "com.adobe.xmp.core.namespace.ResourceEvent"
  val COM_ADOBE_XMP_CORE_NAMESPACE_RESOURCEREF: String = "com.adobe.xmp.core.namespace.ResourceRef"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XML: String = "com.adobe.xmp.core.namespace.XML"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XMPBASIC: String = "com.adobe.xmp.core.namespace.XMPBasic"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XMPBASICJOBTICKET: String = "com.adobe.xmp.core.namespace.XMPBasicJobTicket"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XMPDYNAMICMEDIA: String = "com.adobe.xmp.core.namespace.XMPDynamicMedia"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XMPMEDIAMANAGEMENT: String = "com.adobe.xmp.core.namespace.XMPMediaManagement"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XMPPAGEDTEXT: String = "com.adobe.xmp.core.namespace.XMPPagedText"
  val COM_ADOBE_XMP_CORE_NAMESPACE_XMPRIGHTSMANAGEMENT: String = "com.adobe.xmp.core.namespace.XMPRightsManagement"
  val COM_ADOBE_XMP_CORE_PARSER_RDFXMLPARSERCONTEXT: String = "com.adobe.xmp.core.parser.RDFXMLParserContext"
  val COM_ADOBE_XMP_CORE_SERIALIZER_RDFXMLSERIALIZERCONTEXT: String = "com.adobe.xmp.core.serializer.RDFXMLSerializerContext"
  val COM_ADOBE_XMP_OPTIONS_ALIASOPTIONS: String = "com.adobe.xmp.options.AliasOptions"
  val COM_ADOBE_XMP_OPTIONS_ITERATOROPTIONS: String = "com.adobe.xmp.options.IteratorOptions"
  val COM_ADOBE_XMP_OPTIONS_PARSEOPTIONS: String = "com.adobe.xmp.options.ParseOptions"
  val COM_ADOBE_XMP_OPTIONS_PROPERTYOPTIONS: String = "com.adobe.xmp.options.PropertyOptions"
  val COM_ADOBE_XMP_OPTIONS_SERIALIZEOPTIONS: String = "com.adobe.xmp.options.SerializeOptions"
  val COM_ADOBE_XMP_SCHEMA_MODEL_SIMPLETYPE: String = "com.adobe.xmp.schema.model.SimpleType"
  val COM_DAY_CQ_ANALYTICS_SITECATALYST_ANALYTICSPAGENAMECONTEXT: String = "com.day.cq.analytics.sitecatalyst.AnalyticsPageNameContext"
  val COM_DAY_CQ_ANALYTICS_SITECATALYST_SITECATALYSTWEBSERVICE: String = "com.day.cq.analytics.sitecatalyst.SitecatalystWebservice"
  val COM_DAY_CQ_ANALYTICS_SITECATALYST_UTIL_HTTPCLIENTUTILS: String = "com.day.cq.analytics.sitecatalyst.util.HttpClientUtils"
  val COM_DAY_CQ_ANALYTICS_TESTANDTARGET_UTIL_CONSTANTS: String = "com.day.cq.analytics.testandtarget.util.Constants"
  val COM_DAY_CQ_ANALYTICS_TESTANDTARGET_UTIL_OFFERHELPER: String = "com.day.cq.analytics.testandtarget.util.OfferHelper"
  val COM_DAY_CQ_AUDIT_AUDITLOGEVENT: String = "com.day.cq.audit.AuditLogEvent"
  val COM_DAY_CQ_AUDIT_AUDITLOGPURGERULE: String = "com.day.cq.audit.AuditLogPurgeRule"
  val COM_DAY_CQ_COMMONS_DIFFSERVICE: String = "com.day.cq.commons.DiffService"
  val COM_DAY_CQ_COMMONS_DOWNLOADRESOURCE: String = "com.day.cq.commons.DownloadResource"
  val COM_DAY_CQ_COMMONS_EXTERNALIZER: String = "com.day.cq.commons.Externalizer"
  val COM_DAY_CQ_COMMONS_IMAGERESOURCE: String = "com.day.cq.commons.ImageResource"
  val COM_DAY_CQ_COMMONS_JSONWRITERUTIL: String = "com.day.cq.commons.JSONWriterUtil"
  val COM_DAY_CQ_COMMONS_LANGUAGEUTIL: String = "com.day.cq.commons.LanguageUtil"
  val COM_DAY_CQ_COMMONS_RUNMODEUTIL: String = "com.day.cq.commons.RunModeUtil"
  val COM_DAY_CQ_COMMONS_SYMMETRICCRYPT: String = "com.day.cq.commons.SymmetricCrypt"
  val COM_DAY_CQ_COMMONS_DATE_RELATIVETIMEFORMAT: String = "com.day.cq.commons.date.RelativeTimeFormat"
  val COM_DAY_CQ_COMMONS_FEED_FEED: String = "com.day.cq.commons.feed.Feed"
  val COM_DAY_CQ_COMMONS_JCR_JCRCONSTANTS: String = "com.day.cq.commons.jcr.JcrConstants"
  val COM_DAY_CQ_COMMONS_JCR_JCRRECURSIVEREMOVE: String = "com.day.cq.commons.jcr.JcrRecursiveRemove"
  val COM_DAY_CQ_COMMONS_JCR_JCRUTIL: String = "com.day.cq.commons.jcr.JcrUtil"
  val COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTCOMMANDSERVLET: String = "com.day.cq.commons.servlets.AbstractCommandServlet"
  val COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTLISTSERVLET: String = "com.day.cq.commons.servlets.AbstractListServlet"
  val COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTLISTSERVLET_LISTITEM: String = "com.day.cq.commons.servlets.AbstractListServlet.ListItem"
  val COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTPREDICATESERVLET: String = "com.day.cq.commons.servlets.AbstractPredicateServlet"
  val COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTREPLICABLELISTSERVLET: String = "com.day.cq.commons.servlets.AbstractReplicableListServlet"
  val COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTSEARCHSERVLET: String = "com.day.cq.commons.servlets.AbstractSearchServlet"
  val COM_DAY_CQ_COMMONS_SERVLETS_FEEDRENDERERSERVLET: String = "com.day.cq.commons.servlets.FeedRendererServlet"
  val COM_DAY_CQ_COMMONS_SERVLETS_OVERLAYSERVLET: String = "com.day.cq.commons.servlets.OverlayServlet"
  val COM_DAY_CQ_COMPAT_CODEUPGRADE_MIGRATIONMODECHECK: String = "com.day.cq.compat.codeupgrade.MigrationModeCheck"
  val COM_DAY_CQ_CONTENTSYNC_CONTENTSYNCCONSTANTS: String = "com.day.cq.contentsync.ContentSyncConstants"
  val COM_DAY_CQ_CONTENTSYNC_HANDLER_ABSTRACTDEFAULTCONTENTUPDATEHANDLER: String = "com.day.cq.contentsync.handler.AbstractDefaultContentUpdateHandler"
  val COM_DAY_CQ_DAM_API_DAMCONSTANTS: String = "com.day.cq.dam.api.DamConstants"
  val COM_DAY_CQ_DAM_API_DAMEVENT: String = "com.day.cq.dam.api.DamEvent"
  val COM_DAY_CQ_DAM_API_METADATA: String = "com.day.cq.dam.api.Metadata"
  val COM_DAY_CQ_DAM_API_HANDLER_STORE_ASSETSTORE: String = "com.day.cq.dam.api.handler.store.AssetStore"
  val COM_DAY_CQ_DAM_API_METADATA_COMPONENTHANDLER: String = "com.day.cq.dam.api.metadata.ComponentHandler"
  val COM_DAY_CQ_DAM_API_S7DAM_CONFIG_DYNAMICMEDIASERVICESCONFIG: String = "com.day.cq.dam.api.s7dam.config.DynamicMediaServicesConfig"
  val COM_DAY_CQ_DAM_API_S7DAM_CONFIG_S7DAMYOUTUBEACCOUNTCONFIG: String = "com.day.cq.dam.api.s7dam.config.S7damYouTubeAccountConfig"
  val COM_DAY_CQ_DAM_API_S7DAM_CONFIG_YOUTUBECHANNELCONFIG: String = "com.day.cq.dam.api.s7dam.config.YouTubeChannelConfig"
  val COM_DAY_CQ_DAM_API_S7DAM_CONFIG_YOUTUBECONFIGURATION: String = "com.day.cq.dam.api.s7dam.config.YouTubeConfiguration"
  val COM_DAY_CQ_DAM_API_S7DAM_CONSTANTS_S7DAMCONSTANTS: String = "com.day.cq.dam.api.s7dam.constants.S7damConstants"
  val COM_DAY_CQ_DAM_API_S7DAM_JOBS_S7DAMEXPORTSERVICE: String = "com.day.cq.dam.api.s7dam.jobs.S7damExportService"
  val COM_DAY_CQ_DAM_API_S7DAM_SET_CAROUSELSET: String = "com.day.cq.dam.api.s7dam.set.CarouselSet"
  val COM_DAY_CQ_DAM_API_THUMBNAIL_THUMBNAILCONFIG: String = "com.day.cq.dam.api.thumbnail.ThumbnailConfig"
  val COM_DAY_CQ_DAM_COMMONS_HANDLER_STANDARDIMAGEHANDLER: String = "com.day.cq.dam.commons.handler.StandardImageHandler"
  val COM_DAY_CQ_DAM_COMMONS_METADATA_SIMPLEXMPTOJCRMETADATABUILDER: String = "com.day.cq.dam.commons.metadata.SimpleXmpToJcrMetadataBuilder"
  val COM_DAY_CQ_DAM_COMMONS_METADATA_XMPFILTERBLACKWHITE: String = "com.day.cq.dam.commons.metadata.XmpFilterBlackWhite"
  val COM_DAY_CQ_DAM_COMMONS_METADATA_XMPTOJCRMETADATABUILDER: String = "com.day.cq.dam.commons.metadata.XmpToJcrMetadataBuilder"
  val COM_DAY_CQ_DAM_COMMONS_PROCESS_ABSTRACTASSETWORKFLOWPROCESS: String = "com.day.cq.dam.commons.process.AbstractAssetWorkflowProcess"
  val COM_DAY_CQ_DAM_COMMONS_PROXY_PROXYCONFIG: String = "com.day.cq.dam.commons.proxy.ProxyConfig"
  val COM_DAY_CQ_DAM_COMMONS_UTIL_DAMCONFIGURATIONCONSTANTS: String = "com.day.cq.dam.commons.util.DamConfigurationConstants"
  val COM_DAY_CQ_DAM_COMMONS_UTIL_DAMLANGUAGEUTIL: String = "com.day.cq.dam.commons.util.DamLanguageUtil"
  val COM_DAY_CQ_DAM_COMMONS_UTIL_ORIENTATIONUTIL: String = "com.day.cq.dam.commons.util.OrientationUtil"
  val COM_DAY_CQ_DAM_COMMONS_UTIL_S73DCONSTANTS: String = "com.day.cq.dam.commons.util.S73DConstants"
  val COM_DAY_CQ_DAM_COMMONS_WATERMARK_FONT: String = "com.day.cq.dam.commons.watermark.Font"
  val COM_DAY_CQ_DAM_COMMONS_WATERMARK_TEXTWATERMARK: String = "com.day.cq.dam.commons.watermark.TextWatermark"
  val COM_DAY_CQ_DAM_COMMONS_WATERMARK_WATERMARK: String = "com.day.cq.dam.commons.watermark.Watermark"
  val COM_DAY_CQ_DAM_CORE_PROCESS_EXIFTOOLEXTRACTMETADATAPROCESS: String = "com.day.cq.dam.core.process.ExifToolExtractMetadataProcess"
  val COM_DAY_CQ_DAM_CORE_PROCESS_EXTRACTMETADATAPROCESS: String = "com.day.cq.dam.core.process.ExtractMetadataProcess"
  val COM_DAY_CQ_DAM_CORE_PROCESS_METADATAPROCESSORPROCESS: String = "com.day.cq.dam.core.process.MetadataProcessorProcess"
  val COM_DAY_CQ_DAM_ENTITLEMENT_API_ENTITLEMENTCONSTANTS: String = "com.day.cq.dam.entitlement.api.EntitlementConstants"
  val COM_DAY_CQ_DAM_HANDLER_FFMPEG_LOCATORIMPL: String = "com.day.cq.dam.handler.ffmpeg.LocatorImpl"
  val COM_DAY_CQ_DAM_HANDLER_GIBSON_FONTMANAGER_FONTMANAGEREXCEPTION: String = "com.day.cq.dam.handler.gibson.fontmanager.FontManagerException"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_EPUB_EPUBHANDLER: String = "com.day.cq.dam.handler.standard.epub.EPubHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_HELPER_IMAGEINFO_IMAGEINFO: String = "com.day.cq.dam.handler.standard.helper.imageinfo.ImageInfo"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_KEYNOTE_KEYNOTEPRESENTATION: String = "com.day.cq.dam.handler.standard.keynote.KeynotePresentation"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_MP3_MP3HANDLER: String = "com.day.cq.dam.handler.standard.mp3.Mp3Handler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_MSOFFICE_MSOFFICEHANDLER: String = "com.day.cq.dam.handler.standard.msoffice.MSOfficeHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_MSOFFICE_MSPOWERPOINTHANDLER: String = "com.day.cq.dam.handler.standard.msoffice.MSPowerPointHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_OOXML_MSPOWERPOINTOOXMLHANDLER: String = "com.day.cq.dam.handler.standard.ooxml.MSPowerPointOOXMLHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_OOXML_OPENOFFICEHANDLER: String = "com.day.cq.dam.handler.standard.ooxml.OpenOfficeHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_PDF_PDFHANDLER: String = "com.day.cq.dam.handler.standard.pdf.PdfHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_PS_POSTSCRIPTHANDLER: String = "com.day.cq.dam.handler.standard.ps.PostScriptHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_PSD_PSDHANDLER: String = "com.day.cq.dam.handler.standard.psd.PsdHandler"
  val COM_DAY_CQ_DAM_HANDLER_STANDARD_ZIP_ZIPHANDLER: String = "com.day.cq.dam.handler.standard.zip.ZipHandler"
  val COM_DAY_CQ_DAM_INDD_PAGEEXTRACTIONHANDLER: String = "com.day.cq.dam.indd.PageExtractionHandler"
  val COM_DAY_CQ_DAM_SCENE7_API_S7CONFIGRESOLVER: String = "com.day.cq.dam.scene7.api.S7ConfigResolver"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7APICLIENT: String = "com.day.cq.dam.scene7.api.Scene7APIClient"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7ASSETFACTORY: String = "com.day.cq.dam.scene7.api.Scene7AssetFactory"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7ASSETMIMETYPESERVICE: String = "com.day.cq.dam.scene7.api.Scene7AssetMimetypeService"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7ENDPOINT: String = "com.day.cq.dam.scene7.api.Scene7Endpoint"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7ENDPOINTSMANAGER: String = "com.day.cq.dam.scene7.api.Scene7EndpointsManager"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7FLASHTEMPLATESSERVICE: String = "com.day.cq.dam.scene7.api.Scene7FlashTemplatesService"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7PRESETSSERVICE: String = "com.day.cq.dam.scene7.api.Scene7PresetsService"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7SERVICE: String = "com.day.cq.dam.scene7.api.Scene7Service"
  val COM_DAY_CQ_DAM_SCENE7_API_SCENE7UPLOADSERVICE: String = "com.day.cq.dam.scene7.api.Scene7UploadService"
  val COM_DAY_CQ_DAM_SCENE7_API_CONSTANTS_SCENE7CONSTANTS: String = "com.day.cq.dam.scene7.api.constants.Scene7Constants"
  val COM_DAY_CQ_DAM_USAGE_API_ASSETUSAGETRACKER: String = "com.day.cq.dam.usage.api.AssetUsageTracker"
  val COM_DAY_CQ_DAM_VIDEO_ABSTRACTFFMPEGPROCESS: String = "com.day.cq.dam.video.AbstractFFMpegProcess"
  val COM_DAY_CQ_DAM_VIDEO_VIDEOCONSTANTS: String = "com.day.cq.dam.video.VideoConstants"
  val COM_DAY_CQ_DAM_VIDEO_VIDEOPROFILE: String = "com.day.cq.dam.video.VideoProfile"
  val COM_DAY_CQ_GRAPHICS_GRAPH: String = "com.day.cq.graphics.Graph"
  val COM_DAY_CQ_GRAPHICS_CHART_AXIS: String = "com.day.cq.graphics.chart.Axis"
  val COM_DAY_CQ_GRAPHICS_CHART_BARCHART: String = "com.day.cq.graphics.chart.BarChart"
  val COM_DAY_CQ_MAILER_COMMONS_PROFILEVARIABLELOOKUP: String = "com.day.cq.mailer.commons.ProfileVariableLookup"
  val COM_DAY_CQ_MCM_API_BRAND: String = "com.day.cq.mcm.api.Brand"
  val COM_DAY_CQ_MCM_API_CAMPAIGN: String = "com.day.cq.mcm.api.Campaign"
  val COM_DAY_CQ_MCM_CAMPAIGN_DEFS: String = "com.day.cq.mcm.campaign.Defs"
  val COM_DAY_CQ_MCM_CAMPAIGN_NEWSLETTERSTATUS: String = "com.day.cq.mcm.campaign.NewsletterStatus"
  val COM_DAY_CQ_MCM_CAMPAIGN_RPCDEFS: String = "com.day.cq.mcm.campaign.RpcDefs"
  val COM_DAY_CQ_MCM_CAMPAIGN_IMPORTER_PERSONALIZEDTEXTHANDLERFACTORY: String = "com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory"
  val COM_DAY_CQ_MCM_CORE_NEWSLETTEREMULATORGROUP: String = "com.day.cq.mcm.core.NewsletterEmulatorGroup"
  val COM_DAY_CQ_MCM_CORE_NEWSLETTERHELPER: String = "com.day.cq.mcm.core.NewsletterHelper"
  val COM_DAY_CQ_MCM_EMAILPROVIDER_ESCONSTANTS: String = "com.day.cq.mcm.emailprovider.ESConstants"
  val COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_EMAIL: String = "com.day.cq.mcm.emailprovider.types.Email"
  val COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_PERSONALIZATIONINFO: String = "com.day.cq.mcm.emailprovider.types.PersonalizationInfo"
  val COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_SUBSCRIBER: String = "com.day.cq.mcm.emailprovider.types.Subscriber"
  val COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_SUBSCRIPTIONLIST: String = "com.day.cq.mcm.emailprovider.types.SubscriptionList"
  val COM_DAY_CQ_MCM_EMAILPROVIDER_UTIL_EMAILHELPER: String = "com.day.cq.mcm.emailprovider.util.EmailHelper"
  val COM_DAY_CQ_MCM_EXACTTARGET_EXACTTARGETCONSTANTS: String = "com.day.cq.mcm.exacttarget.ExactTargetConstants"
  val COM_DAY_CQ_MCM_LANDINGPAGE_LEADFORM_CREATOR_LEADFORMSCREATOR: String = "com.day.cq.mcm.landingpage.leadform.creator.LeadFormsCreator"
  val COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_CLICKTHROUGHCOMPONENTTAGHANDLERFACTORY: String = "com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory"
  val COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_GRAPHICALCLICKTHROUGHCOMPONENTTAGHANDLERFACTORY: String = "com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory"
  val COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_LEADFORMCTACOMPONENTTAGHANDLER: String = "com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandler"
  val COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_LEADFORMCTACOMPONENTTAGHANDLERFACTORY: String = "com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory"
  val COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_MBOX_MBOXEXPERIENCETAGHANDLERFACTORY: String = "com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory"
  val COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_MBOX_TARGETCOMPONENTTAGHANDLERFACTORY: String = "com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory"
  val COM_DAY_CQ_PERSONALIZATION_PROFILECONSTANTS: String = "com.day.cq.personalization.ProfileConstants"
  val COM_DAY_CQ_PERSONALIZATION_SEGMENT: String = "com.day.cq.personalization.Segment"
  val COM_DAY_CQ_PERSONALIZATION_TARGETRESOURCETYPEPROVIDER: String = "com.day.cq.personalization.TargetResourceTypeProvider"
  val COM_DAY_CQ_PERSONALIZATION_USERPROPERTIESPROVIDER: String = "com.day.cq.personalization.UserPropertiesProvider"
  val COM_DAY_CQ_PERSONALIZATION_UI_ITEMS_PERSONALIZATIONITEM: String = "com.day.cq.personalization.ui.items.PersonalizationItem"
  val COM_DAY_CQ_POLLING_IMPORTER_IMPORTER: String = "com.day.cq.polling.importer.Importer"
  val COM_DAY_CQ_POLLING_IMPORTER_POLLINGIMPORTER: String = "com.day.cq.polling.importer.PollingImporter"
  val COM_DAY_CQ_REPLICATION_AGENTCONFIG: String = "com.day.cq.replication.AgentConfig"
  val COM_DAY_CQ_REPLICATION_CONTENTBUILDER: String = "com.day.cq.replication.ContentBuilder"
  val COM_DAY_CQ_REPLICATION_REPLICATIONACTION: String = "com.day.cq.replication.ReplicationAction"
  val COM_DAY_CQ_REPLICATION_REPLICATIONEVENT: String = "com.day.cq.replication.ReplicationEvent"
  val COM_DAY_CQ_REPLICATION_REPLICATIONSTATUS: String = "com.day.cq.replication.ReplicationStatus"
  val COM_DAY_CQ_REPLICATION_REPLICATOR: String = "com.day.cq.replication.Replicator"
  val COM_DAY_CQ_REPLICATION_REVERSEREPLICATION: String = "com.day.cq.replication.ReverseReplication"
  val COM_DAY_CQ_REWRITER_HTMLPARSER_DOCUMENTHANDLERTOSAXADAPTER: String = "com.day.cq.rewriter.htmlparser.DocumentHandlerToSAXAdapter"
  val COM_DAY_CQ_REWRITER_HTMLPARSER_HTMLPARSER: String = "com.day.cq.rewriter.htmlparser.HtmlParser"
  val COM_DAY_CQ_REWRITER_LINKCHECKER_LINKINFO: String = "com.day.cq.rewriter.linkchecker.LinkInfo"
  val COM_DAY_CQ_REWRITER_PIPELINE_ATTRIBUTESIMPL: String = "com.day.cq.rewriter.pipeline.AttributesImpl"
  val COM_DAY_CQ_SEARCH_PREDICATE: String = "com.day.cq.search.Predicate"
  val COM_DAY_CQ_SEARCH_PREDICATECONVERTER: String = "com.day.cq.search.PredicateConverter"
  val COM_DAY_CQ_SEARCH_PREDICATEGROUP: String = "com.day.cq.search.PredicateGroup"
  val COM_DAY_CQ_SEARCH_SIMPLESEARCH: String = "com.day.cq.search.SimpleSearch"
  val COM_DAY_CQ_SEARCH_EVAL_COLLECTIONPREDICATEEVALUATOR: String = "com.day.cq.search.eval.CollectionPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_DATERANGEPREDICATEEVALUATOR: String = "com.day.cq.search.eval.DateRangePredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_FULLTEXTPREDICATEEVALUATOR: String = "com.day.cq.search.eval.FulltextPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_JCRBOOLPROPERTYPREDICATEEVALUATOR: String = "com.day.cq.search.eval.JcrBoolPropertyPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_JCRPROPERTYPREDICATEEVALUATOR: String = "com.day.cq.search.eval.JcrPropertyPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_NODENAMEPREDICATEEVALUATOR: String = "com.day.cq.search.eval.NodenamePredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_PATHPREDICATEEVALUATOR: String = "com.day.cq.search.eval.PathPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_PERMISSIONPREDICATEEVALUATOR: String = "com.day.cq.search.eval.PermissionPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_RANGEPROPERTYPREDICATEEVALUATOR: String = "com.day.cq.search.eval.RangePropertyPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_SAVEDQUERYPREDICATE: String = "com.day.cq.search.eval.SavedQueryPredicate"
  val COM_DAY_CQ_SEARCH_EVAL_SIMILARITYPREDICATEEVALUATOR: String = "com.day.cq.search.eval.SimilarityPredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_TYPEPREDICATEEVALUATOR: String = "com.day.cq.search.eval.TypePredicateEvaluator"
  val COM_DAY_CQ_SEARCH_EVAL_XPATH: String = "com.day.cq.search.eval.XPath"
  val COM_DAY_CQ_SEARCH_SUGGEST_BUILDER_SEARCHINDEXSUGGESTIONEXTRACTOR_OPTIONS: String = "com.day.cq.search.suggest.builder.SearchIndexSuggestionExtractor.Options"
  val COM_DAY_CQ_SEARCH_WRITER_SIMPLEHITWRITER: String = "com.day.cq.search.writer.SimpleHitWriter"
  val COM_DAY_CQ_SEARCHPROMOTE_XML_RESULT_RESULTPAGE: String = "com.day.cq.searchpromote.xml.result.ResultPage"
  val COM_DAY_CQ_SECURITY_AUTHORIZABLE: String = "com.day.cq.security.Authorizable"
  val COM_DAY_CQ_SECURITY_USERMANAGER: String = "com.day.cq.security.UserManager"
  val COM_DAY_CQ_WCM_COMMONS_CONSTANTS: String = "com.day.cq.wcm.commons.Constants"
  val COM_DAY_CQ_WCM_COMMONS_WCMUTILS: String = "com.day.cq.wcm.commons.WCMUtils"
  val COM_DAY_CQ_WCM_CONTENTSYNC_PATHREWRITEROPTIONS: String = "com.day.cq.wcm.contentsync.PathRewriterOptions"
  val COM_DAY_CQ_WCM_CORE_CONTENTFINDER_VIEWHANDLER: String = "com.day.cq.wcm.core.contentfinder.ViewHandler"
  val COM_DAY_CQ_WCM_CORE_STATS_PAGEVIEW: String = "com.day.cq.wcm.core.stats.PageView"
  val COM_DAY_CQ_WCM_CORE_STATS_PAGEVIEWPATHBUILDER: String = "com.day.cq.wcm.core.stats.PageViewPathBuilder"
  val COM_DAY_CQ_WCM_CORE_UTILS_PAGENAMEVALIDATORSERVICE: String = "com.day.cq.wcm.core.utils.PageNameValidatorService"
  val COM_DAY_CQ_WCM_EMULATOR_EMULATOR: String = "com.day.cq.wcm.emulator.Emulator"
  val COM_DAY_CQ_WCM_FOUNDATION_ALLOWEDCOMPONENTLIST: String = "com.day.cq.wcm.foundation.AllowedComponentList"
  val COM_DAY_CQ_WCM_FOUNDATION_CHART: String = "com.day.cq.wcm.foundation.Chart"
  val COM_DAY_CQ_WCM_FOUNDATION_EXTERNAL: String = "com.day.cq.wcm.foundation.External"
  val COM_DAY_CQ_WCM_FOUNDATION_IMAGE: String = "com.day.cq.wcm.foundation.Image"
  val COM_DAY_CQ_WCM_FOUNDATION_LIST: String = "com.day.cq.wcm.foundation.List"
  val COM_DAY_CQ_WCM_FOUNDATION_PARAGRAPHLIST: String = "com.day.cq.wcm.foundation.ParagraphList"
  val COM_DAY_CQ_WCM_FOUNDATION_PARAGRAPHSYSTEM: String = "com.day.cq.wcm.foundation.ParagraphSystem"
  val COM_DAY_CQ_WCM_FOUNDATION_PLACEHOLDER: String = "com.day.cq.wcm.foundation.Placeholder"
  val COM_DAY_CQ_WCM_FOUNDATION_FORMS_FORMRESOURCEEDIT: String = "com.day.cq.wcm.foundation.forms.FormResourceEdit"
  val COM_DAY_CQ_WCM_FOUNDATION_FORMS_FORMSCONSTANTS: String = "com.day.cq.wcm.foundation.forms.FormsConstants"
  val COM_DAY_CQ_WCM_FOUNDATION_FORMS_FORMSHELPER: String = "com.day.cq.wcm.foundation.forms.FormsHelper"
  val COM_DAY_CQ_WCM_FOUNDATION_MODEL_RESPONSIVEGRID_RESPONSIVECONSTANTS: String = "com.day.cq.wcm.foundation.model.responsivegrid.ResponsiveConstants"
  val COM_DAY_CQ_WCM_FOUNDATION_SECURITY_ATTACHMENTTYPEBLACKLISTSERVICE: String = "com.day.cq.wcm.foundation.security.AttachmentTypeBlacklistService"
  val COM_DAY_CQ_WCM_FOUNDATION_SECURITY_SAFERSLINGPOSTVALIDATOR: String = "com.day.cq.wcm.foundation.security.SaferSlingPostValidator"
  val COM_DAY_CQ_WCM_MOBILE_API_MOBILECONSTANTS: String = "com.day.cq.wcm.mobile.api.MobileConstants"
  val COM_DAY_CQ_WCM_MOBILE_API_DEVICE_DEVICEGROUP: String = "com.day.cq.wcm.mobile.api.device.DeviceGroup"
  val COM_DAY_CQ_WCM_MOBILE_API_DEVICE_DEVICEGROUPPROVIDER: String = "com.day.cq.wcm.mobile.api.device.DeviceGroupProvider"
  val COM_DAY_CQ_WCM_MOBILE_API_DEVICESPECS_DEVICESPECSCONSTANTS: String = "com.day.cq.wcm.mobile.api.devicespecs.DeviceSpecsConstants"
  val COM_DAY_CQ_WCM_MSM_API_LIVEACTIONFACTORY: String = "com.day.cq.wcm.msm.api.LiveActionFactory"
  val COM_DAY_CQ_WCM_MSM_API_MSMNAMECONSTANTS: String = "com.day.cq.wcm.msm.api.MSMNameConstants"
  val COM_DAY_CQ_WCM_MSM_COMMONS_ITEMFILTERUTIL: String = "com.day.cq.wcm.msm.commons.ItemFilterUtil"
  val COM_DAY_CQ_WCM_SCRIPTING_WCMBINDINGSCONSTANTS: String = "com.day.cq.wcm.scripting.WCMBindingsConstants"
  val COM_DAY_CQ_WCM_TAGS_DEFINEOBJECTSTAG: String = "com.day.cq.wcm.tags.DefineObjectsTag"
  val COM_DAY_CQ_WCM_TAGS_DEFINEOBJECTSTEI: String = "com.day.cq.wcm.tags.DefineObjectsTEI"
  val COM_DAY_CQ_WCM_TAGS_TEXTTAG: String = "com.day.cq.wcm.tags.TextTag"
  val COM_DAY_CQ_WCM_WEBSERVICESUPPORT_CONFIGURATIONCONSTANTS: String = "com.day.cq.wcm.webservicesupport.ConfigurationConstants"
  val COM_DAY_CQ_WCM_WEBSERVICESUPPORT_SERVICE: String = "com.day.cq.wcm.webservicesupport.Service"
  val COM_DAY_CQ_WCM_WEBSERVICESUPPORT_SERVICECONSTANTS: String = "com.day.cq.wcm.webservicesupport.ServiceConstants"
  val COM_DAY_CQ_WCM_WORKFLOW_API_WCMWORKFLOWSERVICE: String = "com.day.cq.wcm.workflow.api.WcmWorkflowService"
  val COM_DAY_CQ_WCM_WORKFLOW_PROCESS_CREATEVERSIONPROCESS: String = "com.day.cq.wcm.workflow.process.CreateVersionProcess"
  val COM_DAY_CQ_WCM_WORKFLOW_PROCESS_REPLICATEPAGEPROCESS: String = "com.day.cq.wcm.workflow.process.ReplicatePageProcess"
  val COM_DAY_CQ_WORKFLOW_COLLECTION_RESOURCECOLLECTION: String = "com.day.cq.workflow.collection.ResourceCollection"
  val COM_DAY_CQ_WORKFLOW_EVENT_EXTERNALPROCESSPOLLINGEVENT: String = "com.day.cq.workflow.event.ExternalProcessPollingEvent"
  val COM_DAY_CQ_WORKFLOW_EVENT_WORKFLOWEVENT: String = "com.day.cq.workflow.event.WorkflowEvent"
  val COM_DAY_CQ_WORKFLOW_EXEC_PARTICIPANTSTEPCHOOSER: String = "com.day.cq.workflow.exec.ParticipantStepChooser"
  val COM_DAY_CQ_WORKFLOW_JOB_ABSOLUTETIMEOUTHANDLER: String = "com.day.cq.workflow.job.AbsoluteTimeoutHandler"
  val COM_DAY_CQ_WORKFLOW_JOB_EXTERNALPROCESSJOB: String = "com.day.cq.workflow.job.ExternalProcessJob"
  val COM_DAY_CQ_WORKFLOW_JOB_TIMEOUTJOB: String = "com.day.cq.workflow.job.TimeoutJob"
  val COM_DAY_CQ_WORKFLOW_JOB_WORKFLOWJOB: String = "com.day.cq.workflow.job.WorkflowJob"
  val COM_DAY_CQ_WORKFLOW_MODEL_WORKFLOWMODELSERIALIZER: String = "com.day.cq.workflow.model.WorkflowModelSerializer"
  val COM_DAY_CQ_WORKFLOW_MODEL_WORKFLOWNODE: String = "com.day.cq.workflow.model.WorkflowNode"
  val COM_DAY_CRX_PACKAGING_JSONRESPONSE: String = "com.day.crx.packaging.JSONResponse"
  val COM_DAY_CRX_PACKAGING_PACKAGESHARE: String = "com.day.crx.packaging.PackageShare"
  val COM_DAY_CRX_PACKAGING_GFX_DOWNLOADRESOURCE: String = "com.day.crx.packaging.gfx.DownloadResource"
  val COM_DAY_CRX_PACKAGING_GFX_IMAGERESOURCE: String = "com.day.crx.packaging.gfx.ImageResource"
  val COM_DAY_CRX_SECURITY_TOKEN_TOKENCOOKIE: String = "com.day.crx.security.token.TokenCookie"
  val COM_DAY_DURBO_DURBOCONSTANTS: String = "com.day.durbo.DurboConstants"
  val COM_DAY_IMAGE_COLORCURVE: String = "com.day.image.ColorCurve"
  val COM_DAY_IMAGE_DITHER: String = "com.day.image.Dither"
  val COM_DAY_IMAGE_LAYER: String = "com.day.image.Layer"
  val COM_DAY_IMAGE_LINESTYLE: String = "com.day.image.LineStyle"
  val COM_DAY_IMAGE_FONT_ABSTRACTFONT: String = "com.day.image.font.AbstractFont"
  val COM_DAY_IMAGEIO_PLUGINS_GIFIMAGEWRITERUTIL: String = "com.day.imageio.plugins.GifImageWriterUtil"
  val COM_DAY_IO_DISK_DISKSPACEUTIL: String = "com.day.io.disk.DiskSpaceUtil"
  val COM_DAY_TEXT_AUTOFORMATTER: String = "com.day.text.AutoFormatter"
  val COM_DAY_TEXT_REPLACE: String = "com.day.text.Replace"
  val COM_DAY_TEXT_STRINGABBREVIATOR: String = "com.day.text.StringAbbreviator"
  val COM_DAY_TEXT_TEXT: String = "com.day.text.Text"
  val COM_DAY_TEXT_XMLCHAR: String = "com.day.text.XMLChar"
  val COM_DAY_UTIL_PROCESSRUNNER: String = "com.day.util.ProcessRunner"
  val COM_DAY_UTIL_TIMING: String = "com.day.util.Timing"
  val COM_DAY_UTIL_DIFF_CHANGELISTENER: String = "com.day.util.diff.ChangeListener"
  val COM_DAY_UTIL_DIFF_DIFFWRITER: String = "com.day.util.diff.DiffWriter"
  val COM_DAY_UTIL_DIFF_DOCUMENTSOURCE: String = "com.day.util.diff.DocumentSource"
  val COM_DAY_UTIL_DIFF_ELEMENTSFACTORY: String = "com.day.util.diff.ElementsFactory"
  val COM_DAY_UTIL_DIFF_HUNK: String = "com.day.util.diff.Hunk"
  val COM_FASTERXML_JACKSON_ANNOTATION_JSONFORMAT: String = "com.fasterxml.jackson.annotation.JsonFormat"
  val COM_FASTERXML_JACKSON_ANNOTATION_JSONPROPERTY: String = "com.fasterxml.jackson.annotation.JsonProperty"
  val COM_FASTERXML_JACKSON_CORE_BASE64VARIANT: String = "com.fasterxml.jackson.core.Base64Variant"
  val COM_FASTERXML_JACKSON_CORE_JSONFACTORY: String = "com.fasterxml.jackson.core.JsonFactory"
  val COM_FASTERXML_JACKSON_CORE_JSONTOKENID: String = "com.fasterxml.jackson.core.JsonTokenId"
  val COM_FASTERXML_JACKSON_CORE_BASE_GENERATORBASE: String = "com.fasterxml.jackson.core.base.GeneratorBase"
  val COM_FASTERXML_JACKSON_CORE_FORMAT_DATAFORMATDETECTOR: String = "com.fasterxml.jackson.core.format.DataFormatDetector"
  val COM_FASTERXML_JACKSON_CORE_IO_CHARACTERESCAPES: String = "com.fasterxml.jackson.core.io.CharacterEscapes"
  val COM_FASTERXML_JACKSON_CORE_IO_NUMBERINPUT: String = "com.fasterxml.jackson.core.io.NumberInput"
  val COM_FASTERXML_JACKSON_CORE_JSON_JSONWRITECONTEXT: String = "com.fasterxml.jackson.core.json.JsonWriteContext"
  val COM_FASTERXML_JACKSON_CORE_SYM_CHARSTONAMECANONICALIZER: String = "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"
  val COM_FASTERXML_JACKSON_CORE_UTIL_BUFFERRECYCLER: String = "com.fasterxml.jackson.core.util.BufferRecycler"
  val COM_FASTERXML_JACKSON_CORE_UTIL_MINIMALPRETTYPRINTER: String = "com.fasterxml.jackson.core.util.MinimalPrettyPrinter"
  val COM_FASTERXML_JACKSON_DATABIND_DESER_DATAFORMATREADERS: String = "com.fasterxml.jackson.databind.deser.DataFormatReaders"
  val COM_FASTERXML_JACKSON_DATABIND_DESER_STD_FROMSTRINGDESERIALIZER_STD: String = "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std"
  val COM_FASTERXML_JACKSON_DATABIND_DESER_STD_STDKEYDESERIALIZER: String = "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"
  val COM_FASTERXML_JACKSON_DATABIND_JSONSCHEMA_JSONSERIALIZABLESCHEMA: String = "com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema"
  val COM_FASTERXML_JACKSON_DATABIND_UTIL_STDDATEFORMAT: String = "com.fasterxml.jackson.databind.util.StdDateFormat"
  val COM_GOOGLE_ZXING_QRCODE_ENCODER_QRCODE: String = "com.google.zxing.qrcode.encoder.QRCode"
  val COM_SUN_MAIL_IAP_RESPONSE: String = "com.sun.mail.iap.Response"
  val COM_SUN_MAIL_IMAP_IMAPSTORE: String = "com.sun.mail.imap.IMAPStore"
  val COM_SUN_MAIL_IMAP_PROTOCOL_LISTINFO: String = "com.sun.mail.imap.protocol.ListInfo"
  val COM_SUN_MAIL_SMTP_SMTPMESSAGE: String = "com.sun.mail.smtp.SMTPMessage"
  val ORG_APACHE_COCOON_XML_SAX_ATTRIBUTETYPES: String = "org.apache.cocoon.xml.sax.AttributeTypes"
  val ORG_APACHE_COMMONS_CODEC_CHARENCODING: String = "org.apache.commons.codec.CharEncoding"
  val ORG_APACHE_COMMONS_CODEC_BINARY_BASENCODEC: String = "org.apache.commons.codec.binary.BaseNCodec"
  val ORG_APACHE_COMMONS_CODEC_BINARY_HEX: String = "org.apache.commons.codec.binary.Hex"
  val ORG_APACHE_COMMONS_CODEC_DIGEST_MESSAGEDIGESTALGORITHMS: String = "org.apache.commons.codec.digest.MessageDigestAlgorithms"
  val ORG_APACHE_COMMONS_CODEC_LANGUAGE_REFINEDSOUNDEX: String = "org.apache.commons.codec.language.RefinedSoundex"
  val ORG_APACHE_COMMONS_CODEC_LANGUAGE_SOUNDEX: String = "org.apache.commons.codec.language.Soundex"
  val ORG_APACHE_COMMONS_CODEC_LANGUAGE_BM_LANGUAGES: String = "org.apache.commons.codec.language.bm.Languages"
  val ORG_APACHE_COMMONS_CODEC_LANGUAGE_BM_RULE: String = "org.apache.commons.codec.language.bm.Rule"
  val ORG_APACHE_COMMONS_COLLECTIONS_REFERENCEMAP: String = "org.apache.commons.collections.ReferenceMap"
  val ORG_APACHE_COMMONS_COLLECTIONS_COMPARATORS_FIXEDORDERCOMPARATOR: String = "org.apache.commons.collections.comparators.FixedOrderComparator"
  val ORG_APACHE_COMMONS_COLLECTIONS_MAP_ABSTRACTREFERENCEMAP: String = "org.apache.commons.collections.map.AbstractReferenceMap"
  val ORG_APACHE_COMMONS_COLLECTIONS4_FUNCTORS_DEFAULTEQUATOR: String = "org.apache.commons.collections4.functors.DefaultEquator"
  val ORG_APACHE_COMMONS_COLLECTIONS4_TRIE_KEYANALYZER: String = "org.apache.commons.collections4.trie.KeyAnalyzer"
  val ORG_APACHE_COMMONS_COLLECTIONS4_TRIE_ANALYZER_STRINGKEYANALYZER: String = "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ARCHIVEENTRY: String = "org.apache.commons.compress.archivers.ArchiveEntry"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ARCHIVESTREAMFACTORY: String = "org.apache.commons.compress.archivers.ArchiveStreamFactory"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ENTRYSTREAMOFFSETS: String = "org.apache.commons.compress.archivers.EntryStreamOffsets"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_AR_ARARCHIVEENTRY: String = "org.apache.commons.compress.archivers.ar.ArArchiveEntry"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_AR_ARARCHIVEOUTPUTSTREAM: String = "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ARJ_ARJARCHIVEENTRY_HOSTOS: String = "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_CPIO_CPIOCONSTANTS: String = "org.apache.commons.compress.archivers.cpio.CpioConstants"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_DUMP_DUMPARCHIVECONSTANTS: String = "org.apache.commons.compress.archivers.dump.DumpArchiveConstants"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_JAR_JARARCHIVEENTRY: String = "org.apache.commons.compress.archivers.jar.JarArchiveEntry"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_TAR_TARARCHIVEENTRY: String = "org.apache.commons.compress.archivers.tar.TarArchiveEntry"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_TAR_TARARCHIVEOUTPUTSTREAM: String = "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_TAR_TARCONSTANTS: String = "org.apache.commons.compress.archivers.tar.TarConstants"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_EXTRAFIELDUTILS_UNPARSEABLEEXTRAFIELD: String = "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_GENERALPURPOSEBIT: String = "org.apache.commons.compress.archivers.zip.GeneralPurposeBit"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_RESOURCEALIGNMENTEXTRAFIELD: String = "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_UNIXSTAT: String = "org.apache.commons.compress.archivers.zip.UnixStat"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_X5455_EXTENDEDTIMESTAMP: String = "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_ZIPARCHIVEENTRY: String = "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_ZIPARCHIVEOUTPUTSTREAM: String = "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"
  val ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_ZIPEXTRAFIELD: String = "org.apache.commons.compress.archivers.zip.ZipExtraField"
  val ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_COMPRESSORSTREAMFACTORY: String = "org.apache.commons.compress.compressors.CompressorStreamFactory"
  val ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_BZIP2_BZIP2COMPRESSORINPUTSTREAM: String = "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"
  val ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_BZIP2_BZIP2COMPRESSOROUTPUTSTREAM: String = "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"
  val ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_LZ77SUPPORT_PARAMETERS: String = "org.apache.commons.compress.compressors.lz77support.Parameters"
  val ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_SNAPPY_SNAPPYCOMPRESSORINPUTSTREAM: String = "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream"
  val ORG_APACHE_COMMONS_COMPRESS_UTILS_CHARSETNAMES: String = "org.apache.commons.compress.utils.CharsetNames"
  val ORG_APACHE_COMMONS_EXEC_EXECUTEWATCHDOG: String = "org.apache.commons.exec.ExecuteWatchdog"
  val ORG_APACHE_COMMONS_EXEC_EXECUTOR: String = "org.apache.commons.exec.Executor"
  val ORG_APACHE_COMMONS_EXEC_INPUTSTREAMPUMPER: String = "org.apache.commons.exec.InputStreamPumper"
  val ORG_APACHE_COMMONS_EXEC_UTIL_DEBUGUTILS: String = "org.apache.commons.exec.util.DebugUtils"
  val ORG_APACHE_COMMONS_FILEUPLOAD_FILEUPLOADBASE: String = "org.apache.commons.fileupload.FileUploadBase"
  val ORG_APACHE_COMMONS_FILEUPLOAD_MULTIPARTSTREAM: String = "org.apache.commons.fileupload.MultipartStream"
  val ORG_APACHE_COMMONS_FILEUPLOAD_DISK_DISKFILEITEM: String = "org.apache.commons.fileupload.disk.DiskFileItem"
  val ORG_APACHE_COMMONS_FILEUPLOAD_DISK_DISKFILEITEMFACTORY: String = "org.apache.commons.fileupload.disk.DiskFileItemFactory"
  val ORG_APACHE_COMMONS_HTTPCLIENT_HTTPSTATE: String = "org.apache.commons.httpclient.HttpState"
  val ORG_APACHE_COMMONS_IMAGING_IMAGINGCONSTANTS: String = "org.apache.commons.imaging.ImagingConstants"
  val ORG_APACHE_COMMONS_IMAGING_COMMON_ITU_T4_T4ANDT6COMPRESSION: String = "org.apache.commons.imaging.common.itu_t4.T4AndT6Compression"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_JPEG_JPEGCONSTANTS: String = "org.apache.commons.imaging.formats.jpeg.JpegConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_JPEG_IPTC_IPTCCONSTANTS: String = "org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_JPEG_SEGMENTS_APP14SEGMENT: String = "org.apache.commons.imaging.formats.jpeg.segments.App14Segment"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_PCX_PCXCONSTANTS: String = "org.apache.commons.imaging.formats.pcx.PcxConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_PNG_PNGCONSTANTS: String = "org.apache.commons.imaging.formats.png.PngConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_PNM_PNMIMAGEPARSER: String = "org.apache.commons.imaging.formats.pnm.PnmImageParser"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_PSD_PSDIMAGEPARSER: String = "org.apache.commons.imaging.formats.psd.PsdImageParser"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_ADOBEPAGEMAKER6TAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_DCFTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_DNGTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_EXIFTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_GPSTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_MICROSOFTHDPHOTOTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_RFC2301TAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFF4TAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.TiffConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFDIRECTORYCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFEPTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFTAGCONSTANTS: String = "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_TAGINFOS_TAGINFO: String = "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo"
  val ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_WRITE_TIFFOUTPUTDIRECTORY: String = "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory"
  val ORG_APACHE_COMMONS_IMAGING_ICC_ICCCONSTANTS: String = "org.apache.commons.imaging.icc.IccConstants"
  val ORG_APACHE_COMMONS_IMAGING_PALETTE_PALETTEFACTORY: String = "org.apache.commons.imaging.palette.PaletteFactory"
  val ORG_APACHE_COMMONS_IO_BYTEORDERMARK: String = "org.apache.commons.io.ByteOrderMark"
  val ORG_APACHE_COMMONS_IO_FILENAMEUTILS: String = "org.apache.commons.io.FilenameUtils"
  val ORG_APACHE_COMMONS_IO_FILEUTILS: String = "org.apache.commons.io.FileUtils"
  val ORG_APACHE_COMMONS_IO_IOUTILS: String = "org.apache.commons.io.IOUtils"
  val ORG_APACHE_COMMONS_LANG_ARRAYUTILS: String = "org.apache.commons.lang.ArrayUtils"
  val ORG_APACHE_COMMONS_LANG_CHARENCODING: String = "org.apache.commons.lang.CharEncoding"
  val ORG_APACHE_COMMONS_LANG_CHARUTILS: String = "org.apache.commons.lang.CharUtils"
  val ORG_APACHE_COMMONS_LANG_CLASSUTILS: String = "org.apache.commons.lang.ClassUtils"
  val ORG_APACHE_COMMONS_LANG_STRINGUTILS: String = "org.apache.commons.lang.StringUtils"
  val ORG_APACHE_COMMONS_LANG_TEXT_STRSUBSTITUTOR: String = "org.apache.commons.lang.text.StrSubstitutor"
  val ORG_APACHE_COMMONS_LANG_TIME_DATEUTILS: String = "org.apache.commons.lang.time.DateUtils"
  val ORG_APACHE_COMMONS_LANG_TIME_DURATIONFORMATUTILS: String = "org.apache.commons.lang.time.DurationFormatUtils"
  val ORG_APACHE_COMMONS_LANG_TIME_FASTDATEFORMAT: String = "org.apache.commons.lang.time.FastDateFormat"
  val ORG_APACHE_COMMONS_LANG3_ARRAYUTILS: String = "org.apache.commons.lang3.ArrayUtils"
  val ORG_APACHE_COMMONS_LANG3_CHARENCODING: String = "org.apache.commons.lang3.CharEncoding"
  val ORG_APACHE_COMMONS_LANG3_CHARUTILS: String = "org.apache.commons.lang3.CharUtils"
  val ORG_APACHE_COMMONS_LANG3_CLASSUTILS: String = "org.apache.commons.lang3.ClassUtils"
  val ORG_APACHE_COMMONS_LANG3_STRINGUTILS: String = "org.apache.commons.lang3.StringUtils"
  val ORG_APACHE_COMMONS_LANG3_BUILDER_DIFFRESULT: String = "org.apache.commons.lang3.builder.DiffResult"
  val ORG_APACHE_COMMONS_LANG3_CONCURRENT_ABSTRACTCIRCUITBREAKER: String = "org.apache.commons.lang3.concurrent.AbstractCircuitBreaker"
  val ORG_APACHE_COMMONS_LANG3_CONCURRENT_TIMEDSEMAPHORE: String = "org.apache.commons.lang3.concurrent.TimedSemaphore"
  val ORG_APACHE_COMMONS_LANG3_TEXT_STRSUBSTITUTOR: String = "org.apache.commons.lang3.text.StrSubstitutor"
  val ORG_APACHE_COMMONS_LANG3_TIME_DATEUTILS: String = "org.apache.commons.lang3.time.DateUtils"
  val ORG_APACHE_COMMONS_LANG3_TIME_DURATIONFORMATUTILS: String = "org.apache.commons.lang3.time.DurationFormatUtils"
  val ORG_APACHE_COMMONS_LANG3_TIME_FASTDATEFORMAT: String = "org.apache.commons.lang3.time.FastDateFormat"
  val ORG_APACHE_COMMONS_LANG3_TIME_FASTDATEPRINTER: String = "org.apache.commons.lang3.time.FastDatePrinter"
  val ORG_APACHE_COMMONS_LOGGING_LOGFACTORY: String = "org.apache.commons.logging.LogFactory"
  val ORG_APACHE_COMMONS_LOGGING_IMPL_SIMPLELOG: String = "org.apache.commons.logging.impl.SimpleLog"
  val ORG_APACHE_COMMONS_LOGGING_IMPL_SLF4JLOGFACTORY: String = "org.apache.commons.logging.impl.SLF4JLogFactory"
  val ORG_APACHE_COMMONS_MAIL_BYTEARRAYDATASOURCE: String = "org.apache.commons.mail.ByteArrayDataSource"
  val ORG_APACHE_COMMONS_MAIL_EMAIL: String = "org.apache.commons.mail.Email"
  val ORG_APACHE_COMMONS_MAIL_EMAILCONSTANTS: String = "org.apache.commons.mail.EmailConstants"
  val ORG_APACHE_COMMONS_MAIL_HTMLEMAIL: String = "org.apache.commons.mail.HtmlEmail"
  val ORG_APACHE_COMMONS_MAIL_IMAGEHTMLEMAIL: String = "org.apache.commons.mail.ImageHtmlEmail"
  val ORG_APACHE_COMMONS_MATH_ANALYSIS_INTERPOLATION_LOESSINTERPOLATOR: String = "org.apache.commons.math.analysis.interpolation.LoessInterpolator"
  val ORG_APACHE_COMMONS_MATH_ANALYSIS_INTERPOLATION_MICROSPHEREINTERPOLATOR: String = "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator"
  val ORG_APACHE_COMMONS_MATH_ANALYSIS_SOLVERS_BRENTSOLVER: String = "org.apache.commons.math.analysis.solvers.BrentSolver"
  val ORG_APACHE_COMMONS_MATH_DFP_DFP: String = "org.apache.commons.math.dfp.Dfp"
  val ORG_APACHE_COMMONS_MATH_DFP_DFPFIELD: String = "org.apache.commons.math.dfp.DfpField"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_BETADISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.BetaDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_CAUCHYDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.CauchyDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_CHISQUAREDDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.ChiSquaredDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_EXPONENTIALDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.ExponentialDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_FDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.FDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_GAMMADISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.GammaDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_NORMALDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.NormalDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_POISSONDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.PoissonDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_TDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.TDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_DISTRIBUTION_WEIBULLDISTRIBUTIONIMPL: String = "org.apache.commons.math.distribution.WeibullDistributionImpl"
  val ORG_APACHE_COMMONS_MATH_ESTIMATION_ABSTRACTESTIMATOR: String = "org.apache.commons.math.estimation.AbstractEstimator"
  val ORG_APACHE_COMMONS_MATH_LINEAR_BLOCKFIELDMATRIX: String = "org.apache.commons.math.linear.BlockFieldMatrix"
  val ORG_APACHE_COMMONS_MATH_LINEAR_BLOCKREALMATRIX: String = "org.apache.commons.math.linear.BlockRealMatrix"
  val ORG_APACHE_COMMONS_MATH_LINEAR_CHOLESKYDECOMPOSITIONIMPL: String = "org.apache.commons.math.linear.CholeskyDecompositionImpl"
  val ORG_APACHE_COMMONS_MATH_LINEAR_OPENMAPREALVECTOR: String = "org.apache.commons.math.linear.OpenMapRealVector"
  val ORG_APACHE_COMMONS_MATH_ODE_EVENTS_EVENTHANDLER: String = "org.apache.commons.math.ode.events.EventHandler"
  val ORG_APACHE_COMMONS_MATH_ODE_JACOBIANS_EVENTHANDLERWITHJACOBIANS: String = "org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians"
  val ORG_APACHE_COMMONS_MATH_OPTIMIZATION_DIRECT_POWELLOPTIMIZER: String = "org.apache.commons.math.optimization.direct.PowellOptimizer"
  val ORG_APACHE_COMMONS_MATH_OPTIMIZATION_GENERAL_ABSTRACTLEASTSQUARESOPTIMIZER: String = "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
  val ORG_APACHE_COMMONS_MATH_OPTIMIZATION_GENERAL_ABSTRACTSCALARDIFFERENTIABLEOPTIMIZER: String = "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer"
  val ORG_APACHE_COMMONS_MATH_OPTIMIZATION_LINEAR_ABSTRACTLINEAROPTIMIZER: String = "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer"
  val ORG_APACHE_COMMONS_MATH_RANDOM_VALUESERVER: String = "org.apache.commons.math.random.ValueServer"
  val ORG_APACHE_COMMONS_MATH_SPECIAL_GAMMA: String = "org.apache.commons.math.special.Gamma"
  val ORG_APACHE_COMMONS_MATH_STAT_DESCRIPTIVE_DESCRIPTIVESTATISTICS: String = "org.apache.commons.math.stat.descriptive.DescriptiveStatistics"
  val ORG_APACHE_COMMONS_MATH_UTIL_FASTMATH: String = "org.apache.commons.math.util.FastMath"
  val ORG_APACHE_COMMONS_MATH_UTIL_MATHUTILS: String = "org.apache.commons.math.util.MathUtils"
  val ORG_APACHE_COMMONS_MATH_UTIL_RESIZABLEDOUBLEARRAY: String = "org.apache.commons.math.util.ResizableDoubleArray"
  val ORG_APACHE_FELIX_HTTP_WHITEBOARD_HTTPWHITEBOARDCONSTANTS: String = "org.apache.felix.http.whiteboard.HttpWhiteboardConstants"
  val ORG_APACHE_FELIX_INVENTORY_INVENTORYPRINTER: String = "org.apache.felix.inventory.InventoryPrinter"
  val ORG_APACHE_FELIX_JAAS_LOGINMODULEFACTORY: String = "org.apache.felix.jaas.LoginModuleFactory"
  val ORG_APACHE_FELIX_JAAS_BOOT_PROXYLOGINMODULE: String = "org.apache.felix.jaas.boot.ProxyLoginModule"
  val ORG_APACHE_FELIX_METATYPE_AD: String = "org.apache.felix.metatype.AD"
  val ORG_APACHE_FELIX_WEBCONSOLE_ABSTRACTWEBCONSOLEPLUGIN: String = "org.apache.felix.webconsole.AbstractWebConsolePlugin"
  val ORG_APACHE_FELIX_WEBCONSOLE_CONFIGURATIONPRINTER: String = "org.apache.felix.webconsole.ConfigurationPrinter"
  val ORG_APACHE_FELIX_WEBCONSOLE_WEBCONSOLECONSTANTS: String = "org.apache.felix.webconsole.WebConsoleConstants"
  val ORG_APACHE_FELIX_WEBCONSOLE_WEBCONSOLESECURITYPROVIDER2: String = "org.apache.felix.webconsole.WebConsoleSecurityProvider2"
  val ORG_APACHE_JACKRABBIT_JCRCONSTANTS: String = "org.apache.jackrabbit.JcrConstants"
  val ORG_APACHE_JACKRABBIT_API_JACKRABBITNODETYPEMANAGER: String = "org.apache.jackrabbit.api.JackrabbitNodeTypeManager"
  val ORG_APACHE_JACKRABBIT_API_JACKRABBITREPOSITORY: String = "org.apache.jackrabbit.api.JackrabbitRepository"
  val ORG_APACHE_JACKRABBIT_API_JACKRABBITSESSION: String = "org.apache.jackrabbit.api.JackrabbitSession"
  val ORG_APACHE_JACKRABBIT_API_JMX_QUERYSTATMANAGERMBEAN: String = "org.apache.jackrabbit.api.jmx.QueryStatManagerMBean"
  val ORG_APACHE_JACKRABBIT_API_SECURITY_PRINCIPAL_PRINCIPALMANAGER: String = "org.apache.jackrabbit.api.security.principal.PrincipalManager"
  val ORG_APACHE_JACKRABBIT_API_SECURITY_USER_USERMANAGER: String = "org.apache.jackrabbit.api.security.user.UserManager"
  val ORG_APACHE_JACKRABBIT_COMMONS_GENERICREPOSITORYFACTORY: String = "org.apache.jackrabbit.commons.GenericRepositoryFactory"
  val ORG_APACHE_JACKRABBIT_COMMONS_JCRUTILS: String = "org.apache.jackrabbit.commons.JcrUtils"
  val ORG_APACHE_JACKRABBIT_COMMONS_JNDIREPOSITORYFACTORY: String = "org.apache.jackrabbit.commons.JndiRepositoryFactory"
  val ORG_APACHE_JACKRABBIT_COMMONS_NAMESPACEHELPER: String = "org.apache.jackrabbit.commons.NamespaceHelper"
  val ORG_APACHE_JACKRABBIT_COMMONS_CND_LEXER: String = "org.apache.jackrabbit.commons.cnd.Lexer"
  val ORG_APACHE_JACKRABBIT_COMMONS_JACKRABBIT_USER_AUTHORIZABLEQUERYMANAGER: String = "org.apache.jackrabbit.commons.jackrabbit.user.AuthorizableQueryManager"
  val ORG_APACHE_JACKRABBIT_COMMONS_PREDICATE_NTFILEPREDICATE: String = "org.apache.jackrabbit.commons.predicate.NtFilePredicate"
  val ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_ATOMFEEDCONSTANTS: String = "org.apache.jackrabbit.commons.webdav.AtomFeedConstants"
  val ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_EVENTUTIL: String = "org.apache.jackrabbit.commons.webdav.EventUtil"
  val ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_JCRREMOTINGCONSTANTS: String = "org.apache.jackrabbit.commons.webdav.JcrRemotingConstants"
  val ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_NODETYPECONSTANTS: String = "org.apache.jackrabbit.commons.webdav.NodeTypeConstants"
  val ORG_APACHE_JACKRABBIT_COMMONS_XML_SERIALIZINGCONTENTHANDLER: String = "org.apache.jackrabbit.commons.xml.SerializingContentHandler"
  val ORG_APACHE_JACKRABBIT_CORE_CONFIG_DATASOURCECONFIG: String = "org.apache.jackrabbit.core.config.DataSourceConfig"
  val ORG_APACHE_JACKRABBIT_CORE_DATA_FSBACKEND: String = "org.apache.jackrabbit.core.data.FSBackend"
  val ORG_APACHE_JACKRABBIT_CORE_DATA_DB_DBDATASTORE: String = "org.apache.jackrabbit.core.data.db.DbDataStore"
  val ORG_APACHE_JACKRABBIT_CORE_FS_FILESYSTEM: String = "org.apache.jackrabbit.core.fs.FileSystem"
  val ORG_APACHE_JACKRABBIT_CORE_UTIL_DB_CHECKSCHEMAOPERATION: String = "org.apache.jackrabbit.core.util.db.CheckSchemaOperation"
  val ORG_APACHE_JACKRABBIT_CORE_UTIL_DB_DERBYCONNECTIONHELPER: String = "org.apache.jackrabbit.core.util.db.DerbyConnectionHelper"
  val ORG_APACHE_JACKRABBIT_OAK_API_COMMITFAILEDEXCEPTION: String = "org.apache.jackrabbit.oak.api.CommitFailedException"
  val ORG_APACHE_JACKRABBIT_OAK_API_QUERYENGINE: String = "org.apache.jackrabbit.oak.api.QueryEngine"
  val ORG_APACHE_JACKRABBIT_OAK_API_ROOT: String = "org.apache.jackrabbit.oak.api.Root"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_CACHESTATSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.CacheStatsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_CHECKPOINTMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.CheckpointMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_CONSOLIDATEDCACHESTATSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.ConsolidatedCacheStatsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_CONSOLIDATEDDATASTORECACHESTATSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.ConsolidatedDataStoreCacheStatsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_COPYONWRITESTOREMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.CopyOnWriteStoreMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_DESCRIPTION: String = "org.apache.jackrabbit.oak.api.jmx.Description"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_FILESTOREBACKUPRESTOREMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.FileStoreBackupRestoreMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_IMPACT: String = "org.apache.jackrabbit.oak.api.jmx.Impact"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_INDEXERMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.IndexerMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_INDEXSTATSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.IndexStatsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_NAME: String = "org.apache.jackrabbit.oak.api.jmx.Name"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_PERSISTENTCACHESTATSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.PersistentCacheStatsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_QUERYENGINESETTINGSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.QueryEngineSettingsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_REPOSITORYMANAGEMENTMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.RepositoryManagementMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_REPOSITORYSTATSMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.RepositoryStatsMBean"
  val ORG_APACHE_JACKRABBIT_OAK_API_JMX_SESSIONMBEAN: String = "org.apache.jackrabbit.oak.api.jmx.SessionMBean"
  val ORG_APACHE_JACKRABBIT_OAK_PLUGINS_TREE_TREECONSTANTS: String = "org.apache.jackrabbit.oak.plugins.tree.TreeConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_BACKGROUNDOBSERVER: String = "org.apache.jackrabbit.oak.spi.commit.BackgroundObserver"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_BACKGROUNDOBSERVERMBEAN: String = "org.apache.jackrabbit.oak.spi.commit.BackgroundObserverMBean"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_COMMITCONTEXT: String = "org.apache.jackrabbit.oak.spi.commit.CommitContext"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_COMMITINFO: String = "org.apache.jackrabbit.oak.spi.commit.CommitInfo"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_COMPOSITECONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.CompositeConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_REGISTRATIONCONSTANTS: String = "org.apache.jackrabbit.oak.spi.security.RegistrationConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_ABSTRACTLOGINMODULE: String = "org.apache.jackrabbit.oak.spi.security.authentication.AbstractLoginModule"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_AUTHENTICATIONCONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.authentication.AuthenticationConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_EXTERNAL_BASIC_DEFAULTSYNCCONTEXT: String = "org.apache.jackrabbit.oak.spi.security.authentication.external.basic.DefaultSyncContext"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_TOKEN_TOKENCONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.authentication.token.TokenConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_TOKEN_TOKENCONSTANTS: String = "org.apache.jackrabbit.oak.spi.security.authentication.token.TokenConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_TOKEN_TOKENPROVIDER: String = "org.apache.jackrabbit.oak.spi.security.authentication.token.TokenProvider"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_AUTHORIZATIONCONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.authorization.AuthorizationConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_ACCESSCONTROL_ACCESSCONTROLCONSTANTS: String = "org.apache.jackrabbit.oak.spi.security.authorization.accesscontrol.AccessControlConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_PERMISSION_PERMISSIONCONSTANTS: String = "org.apache.jackrabbit.oak.spi.security.authorization.permission.PermissionConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_PERMISSION_PERMISSIONS: String = "org.apache.jackrabbit.oak.spi.security.authorization.permission.Permissions"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRINCIPAL_EVERYONEPRINCIPAL: String = "org.apache.jackrabbit.oak.spi.security.principal.EveryonePrincipal"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRINCIPAL_PRINCIPALCONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.principal.PrincipalConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRIVILEGE_PRIVILEGECONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.privilege.PrivilegeConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRIVILEGE_PRIVILEGECONSTANTS: String = "org.apache.jackrabbit.oak.spi.security.privilege.PrivilegeConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_USERCONFIGURATION: String = "org.apache.jackrabbit.oak.spi.security.user.UserConfiguration"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_USERCONSTANTS: String = "org.apache.jackrabbit.oak.spi.security.user.UserConstants"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_ACTION_ACCESSCONTROLACTION: String = "org.apache.jackrabbit.oak.spi.security.user.action.AccessControlAction"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_ACTION_PASSWORDVALIDATIONACTION: String = "org.apache.jackrabbit.oak.spi.security.user.action.PasswordValidationAction"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_UTIL_PASSWORDUTIL: String = "org.apache.jackrabbit.oak.spi.security.user.util.PasswordUtil"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_CONFLICTANNOTATINGREBASEDIFF: String = "org.apache.jackrabbit.oak.spi.state.ConflictAnnotatingRebaseDiff"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_MOVEDETECTOR: String = "org.apache.jackrabbit.oak.spi.state.MoveDetector"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_NODESTOREPROVIDER: String = "org.apache.jackrabbit.oak.spi.state.NodeStoreProvider"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_REVISIONGC: String = "org.apache.jackrabbit.oak.spi.state.RevisionGC"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_REVISIONGCMBEAN: String = "org.apache.jackrabbit.oak.spi.state.RevisionGCMBean"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_WHITEBOARD_WHITEBOARDUTILS: String = "org.apache.jackrabbit.oak.spi.whiteboard.WhiteboardUtils"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_XML_IMPORTBEHAVIOR: String = "org.apache.jackrabbit.oak.spi.xml.ImportBehavior"
  val ORG_APACHE_JACKRABBIT_OAK_SPI_XML_PROTECTEDITEMIMPORTER: String = "org.apache.jackrabbit.oak.spi.xml.ProtectedItemImporter"
  val ORG_APACHE_JACKRABBIT_SPI_NAME: String = "org.apache.jackrabbit.spi.Name"
  val ORG_APACHE_JACKRABBIT_SPI_PATH: String = "org.apache.jackrabbit.spi.Path"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_ITEMINFOCACHEIMPL: String = "org.apache.jackrabbit.spi.commons.ItemInfoCacheImpl"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_NODETYPE_NODETYPEDEFDIFF: String = "org.apache.jackrabbit.spi.commons.nodetype.NodeTypeDefDiff"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_LOCATIONSTEPQUERYNODE: String = "org.apache.jackrabbit.spi.commons.query.LocationStepQueryNode"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_PROPERTYFUNCTIONQUERYNODE: String = "org.apache.jackrabbit.spi.commons.query.PropertyFunctionQueryNode"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_QUERYCONSTANTS: String = "org.apache.jackrabbit.spi.commons.query.QueryConstants"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_QUERYNODE: String = "org.apache.jackrabbit.spi.commons.query.QueryNode"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_SQL_JCRSQLPARSERCONSTANTS: String = "org.apache.jackrabbit.spi.commons.query.sql.JCRSQLParserConstants"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_SQL_JCRSQLPARSERTREECONSTANTS: String = "org.apache.jackrabbit.spi.commons.query.sql.JCRSQLParserTreeConstants"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_SQL_SIMPLECHARSTREAM: String = "org.apache.jackrabbit.spi.commons.query.sql.SimpleCharStream"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_XPATH_SIMPLECHARSTREAM: String = "org.apache.jackrabbit.spi.commons.query.xpath.SimpleCharStream"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_XPATH_XPATHCONSTANTS: String = "org.apache.jackrabbit.spi.commons.query.xpath.XPathConstants"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_XPATH_XPATHTREECONSTANTS: String = "org.apache.jackrabbit.spi.commons.query.xpath.XPathTreeConstants"
  val ORG_APACHE_JACKRABBIT_SPI_COMMONS_VALUE_ABSTRACTQVALUEFACTORY: String = "org.apache.jackrabbit.spi.commons.value.AbstractQValueFactory"
  val ORG_APACHE_JACKRABBIT_UTIL_XMLCHAR: String = "org.apache.jackrabbit.util.XMLChar"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_API_REPOSITORYADDRESS: String = "org.apache.jackrabbit.vault.fs.api.RepositoryAddress"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_API_VAULTFSCONFIG: String = "org.apache.jackrabbit.vault.fs.api.VaultFsConfig"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_ABSTRACTCONFIG: String = "org.apache.jackrabbit.vault.fs.config.AbstractConfig"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_ABSTRACTVAULTFSCONFIG: String = "org.apache.jackrabbit.vault.fs.config.AbstractVaultFsConfig"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_CREDENTIALSCONFIG: String = "org.apache.jackrabbit.vault.fs.config.CredentialsConfig"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_DEFAULTWORKSPACEFILTER: String = "org.apache.jackrabbit.vault.fs.config.DefaultWorkspaceFilter"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_METAINF: String = "org.apache.jackrabbit.vault.fs.config.MetaInf"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_SIMPLECREDENTIALSCONFIG: String = "org.apache.jackrabbit.vault.fs.config.SimpleCredentialsConfig"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_VAULTAUTHCONFIG: String = "org.apache.jackrabbit.vault.fs.config.VaultAuthConfig"
  val ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_VAULTSETTINGS: String = "org.apache.jackrabbit.vault.fs.config.VaultSettings"
  val ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_JCRPACKAGE: String = "org.apache.jackrabbit.vault.packaging.JcrPackage"
  val ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_JCRPACKAGEDEFINITION: String = "org.apache.jackrabbit.vault.packaging.JcrPackageDefinition"
  val ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_PACKAGEID: String = "org.apache.jackrabbit.vault.packaging.PackageId"
  val ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_PACKAGEPROPERTIES: String = "org.apache.jackrabbit.vault.packaging.PackageProperties"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_CONSTANTS: String = "org.apache.jackrabbit.vault.util.Constants"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_JCRCONSTANTS: String = "org.apache.jackrabbit.vault.util.JcrConstants"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_MIMETYPES: String = "org.apache.jackrabbit.vault.util.MimeTypes"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_LINESEPARATOR: String = "org.apache.jackrabbit.vault.util.xml.serialize.LineSeparator"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_METHOD: String = "org.apache.jackrabbit.vault.util.xml.serialize.Method"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_OUTPUTFORMAT_DEFAULTS: String = "org.apache.jackrabbit.vault.util.xml.serialize.OutputFormat.Defaults"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_OUTPUTFORMAT_DTD: String = "org.apache.jackrabbit.vault.util.xml.serialize.OutputFormat.DTD"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_XERCES_DOM_DOMMESSAGEFORMATTER: String = "org.apache.jackrabbit.vault.util.xml.xerces.dom.DOMMessageFormatter"
  val ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_XERCES_UTIL_XMLCHAR: String = "org.apache.jackrabbit.vault.util.xml.xerces.util.XMLChar"
  val ORG_APACHE_JACKRABBIT_WEBDAV_DAVCOMPLIANCE: String = "org.apache.jackrabbit.webdav.DavCompliance"
  val ORG_APACHE_JACKRABBIT_WEBDAV_DAVCONSTANTS: String = "org.apache.jackrabbit.webdav.DavConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_DAVEXCEPTION: String = "org.apache.jackrabbit.webdav.DavException"
  val ORG_APACHE_JACKRABBIT_WEBDAV_DAVMETHODS: String = "org.apache.jackrabbit.webdav.DavMethods"
  val ORG_APACHE_JACKRABBIT_WEBDAV_DAVRESOURCE: String = "org.apache.jackrabbit.webdav.DavResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_DAVSERVLETRESPONSE: String = "org.apache.jackrabbit.webdav.DavServletResponse"
  val ORG_APACHE_JACKRABBIT_WEBDAV_BIND_BINDCONSTANTS: String = "org.apache.jackrabbit.webdav.bind.BindConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_HEADER_OVERWRITEHEADER: String = "org.apache.jackrabbit.webdav.header.OverwriteHeader"
  val ORG_APACHE_JACKRABBIT_WEBDAV_OBSERVATION_OBSERVATIONCONSTANTS: String = "org.apache.jackrabbit.webdav.observation.ObservationConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_OBSERVATION_OBSERVATIONRESOURCE: String = "org.apache.jackrabbit.webdav.observation.ObservationResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_ORDERING_ORDERINGCONSTANTS: String = "org.apache.jackrabbit.webdav.ordering.OrderingConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_ORDERING_ORDERINGRESOURCE: String = "org.apache.jackrabbit.webdav.ordering.OrderingResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_PROPERTY_RESOURCETYPE: String = "org.apache.jackrabbit.webdav.property.ResourceType"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SEARCH_SEARCHCONSTANTS: String = "org.apache.jackrabbit.webdav.search.SearchConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SEARCH_SEARCHINFO: String = "org.apache.jackrabbit.webdav.search.SearchInfo"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SEARCH_SEARCHRESOURCE: String = "org.apache.jackrabbit.webdav.search.SearchResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_ACLRESOURCE: String = "org.apache.jackrabbit.webdav.security.AclResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_PRINCIPAL: String = "org.apache.jackrabbit.webdav.security.Principal"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_PRIVILEGE: String = "org.apache.jackrabbit.webdav.security.Privilege"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_ACLPRINCIPALREPORT: String = "org.apache.jackrabbit.webdav.security.report.AclPrincipalReport"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_PRINCIPALMATCHREPORT: String = "org.apache.jackrabbit.webdav.security.report.PrincipalMatchReport"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_PRINCIPALSEARCHREPORT: String = "org.apache.jackrabbit.webdav.security.report.PrincipalSearchReport"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_SEARCHABLEPROPERTYREPORT: String = "org.apache.jackrabbit.webdav.security.report.SearchablePropertyReport"
  val ORG_APACHE_JACKRABBIT_WEBDAV_SERVER_ABSTRACTWEBDAVSERVLET: String = "org.apache.jackrabbit.webdav.server.AbstractWebdavServlet"
  val ORG_APACHE_JACKRABBIT_WEBDAV_TRANSACTION_TRANSACTIONCONSTANTS: String = "org.apache.jackrabbit.webdav.transaction.TransactionConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_TRANSACTION_TRANSACTIONRESOURCE: String = "org.apache.jackrabbit.webdav.transaction.TransactionResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_TRANSACTION_TXACTIVELOCK: String = "org.apache.jackrabbit.webdav.transaction.TxActiveLock"
  val ORG_APACHE_JACKRABBIT_WEBDAV_UTIL_CSRFUTIL: String = "org.apache.jackrabbit.webdav.util.CSRFUtil"
  val ORG_APACHE_JACKRABBIT_WEBDAV_UTIL_HTTPDATEFORMAT: String = "org.apache.jackrabbit.webdav.util.HttpDateFormat"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_DELTAVCONSTANTS: String = "org.apache.jackrabbit.webdav.version.DeltaVConstants"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_DELTAVRESOURCE: String = "org.apache.jackrabbit.webdav.version.DeltaVResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_LABELINFO: String = "org.apache.jackrabbit.webdav.version.LabelInfo"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_UPDATEINFO: String = "org.apache.jackrabbit.webdav.version.UpdateInfo"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONABLERESOURCE: String = "org.apache.jackrabbit.webdav.version.VersionableResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONCONTROLLEDRESOURCE: String = "org.apache.jackrabbit.webdav.version.VersionControlledResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONHISTORYRESOURCE: String = "org.apache.jackrabbit.webdav.version.VersionHistoryResource"
  val ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONRESOURCE: String = "org.apache.jackrabbit.webdav.version.VersionResource"
  val ORG_APACHE_LOG4J_LEVEL: String = "org.apache.log4j.Level"
  val ORG_APACHE_LOG4J_NDC: String = "org.apache.log4j.NDC"
  val ORG_APACHE_LOG4J_PRIORITY: String = "org.apache.log4j.Priority"
  val ORG_APACHE_LOG4J_HELPERS_LOGLOG: String = "org.apache.log4j.helpers.LogLog"
  val ORG_APACHE_LOG4J_SPI_CONFIGURATOR: String = "org.apache.log4j.spi.Configurator"
  val ORG_APACHE_OLTU_JOSE_JWS_JWSCONSTANTS: String = "org.apache.oltu.jose.jws.JWSConstants"
  val ORG_APACHE_OLTU_JOSE_JWS_IO_JWSHEADERWRITER: String = "org.apache.oltu.jose.jws.io.JWSHeaderWriter"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH: String = "org.apache.oltu.oauth2.common.OAuth"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_CONTENTTYPE: String = "org.apache.oltu.oauth2.common.OAuth.ContentType"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_HEADERTYPE: String = "org.apache.oltu.oauth2.common.OAuth.HeaderType"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_HTTPMETHOD: String = "org.apache.oltu.oauth2.common.OAuth.HttpMethod"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_WWWAUTHHEADER: String = "org.apache.oltu.oauth2.common.OAuth.WWWAuthHeader"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR: String = "org.apache.oltu.oauth2.common.error.OAuthError"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR_CODERESPONSE: String = "org.apache.oltu.oauth2.common.error.OAuthError.CodeResponse"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR_RESOURCERESPONSE: String = "org.apache.oltu.oauth2.common.error.OAuthError.ResourceResponse"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR_TOKENRESPONSE: String = "org.apache.oltu.oauth2.common.error.OAuthError.TokenResponse"
  val ORG_APACHE_OLTU_OAUTH2_COMMON_UTILS_OAUTHUTILS: String = "org.apache.oltu.oauth2.common.utils.OAuthUtils"
  val ORG_APACHE_OLTU_OAUTH2_JWT_IO_JWTCLAIMSSETWRITER: String = "org.apache.oltu.oauth2.jwt.io.JWTClaimsSetWriter"
  val ORG_APACHE_OLTU_OAUTH2_JWT_IO_JWTHEADERWRITER: String = "org.apache.oltu.oauth2.jwt.io.JWTHeaderWriter"
  val ORG_APACHE_SLING_API_SLINGCONSTANTS: String = "org.apache.sling.api.SlingConstants"
  val ORG_APACHE_SLING_API_ADAPTER_ADAPTERFACTORY: String = "org.apache.sling.api.adapter.AdapterFactory"
  val ORG_APACHE_SLING_API_ADAPTER_ADAPTERMANAGER: String = "org.apache.sling.api.adapter.AdapterManager"
  val ORG_APACHE_SLING_API_AUTH_AUTHENTICATOR: String = "org.apache.sling.api.auth.Authenticator"
  val ORG_APACHE_SLING_API_REQUEST_REQUESTDISPATCHEROPTIONS: String = "org.apache.sling.api.request.RequestDispatcherOptions"
  val ORG_APACHE_SLING_API_REQUEST_SLINGREQUESTLISTENER: String = "org.apache.sling.api.request.SlingRequestListener"
  val ORG_APACHE_SLING_API_RESOURCE_QUERIABLERESOURCEPROVIDER: String = "org.apache.sling.api.resource.QueriableResourceProvider"
  val ORG_APACHE_SLING_API_RESOURCE_RESOURCE: String = "org.apache.sling.api.resource.Resource"
  val ORG_APACHE_SLING_API_RESOURCE_RESOURCEMETADATA: String = "org.apache.sling.api.resource.ResourceMetadata"
  val ORG_APACHE_SLING_API_RESOURCE_RESOURCEPROVIDER: String = "org.apache.sling.api.resource.ResourceProvider"
  val ORG_APACHE_SLING_API_RESOURCE_RESOURCEPROVIDERFACTORY: String = "org.apache.sling.api.resource.ResourceProviderFactory"
  val ORG_APACHE_SLING_API_RESOURCE_RESOURCERESOLVER: String = "org.apache.sling.api.resource.ResourceResolver"
  val ORG_APACHE_SLING_API_RESOURCE_RESOURCERESOLVERFACTORY: String = "org.apache.sling.api.resource.ResourceResolverFactory"
  val ORG_APACHE_SLING_API_RESOURCE_OBSERVATION_RESOURCECHANGELISTENER: String = "org.apache.sling.api.resource.observation.ResourceChangeListener"
  val ORG_APACHE_SLING_API_RESOURCE_PATH_PATH: String = "org.apache.sling.api.resource.path.Path"
  val ORG_APACHE_SLING_API_SCRIPTING_SLINGBINDINGS: String = "org.apache.sling.api.scripting.SlingBindings"
  val ORG_APACHE_SLING_API_SCRIPTING_SLINGSCRIPTCONSTANTS: String = "org.apache.sling.api.scripting.SlingScriptConstants"
  val ORG_APACHE_SLING_API_SECURITY_RESOURCEACCESSSECURITY: String = "org.apache.sling.api.security.ResourceAccessSecurity"
  val ORG_APACHE_SLING_API_SERVLETS_HTMLRESPONSE: String = "org.apache.sling.api.servlets.HtmlResponse"
  val ORG_APACHE_SLING_API_SERVLETS_HTTPCONSTANTS: String = "org.apache.sling.api.servlets.HttpConstants"
  val ORG_APACHE_SLING_API_SERVLETS_SERVLETRESOLVERCONSTANTS: String = "org.apache.sling.api.servlets.ServletResolverConstants"
  val ORG_APACHE_SLING_API_WRAPPERS_SLINGREQUESTPATHS: String = "org.apache.sling.api.wrappers.SlingRequestPaths"
  val ORG_APACHE_SLING_AUTH_CORE_AUTHCONSTANTS: String = "org.apache.sling.auth.core.AuthConstants"
  val ORG_APACHE_SLING_AUTH_CORE_AUTHENTICATIONSUPPORT: String = "org.apache.sling.auth.core.AuthenticationSupport"
  val ORG_APACHE_SLING_AUTH_CORE_SPI_ABSTRACTAUTHENTICATIONFORMSERVLET: String = "org.apache.sling.auth.core.spi.AbstractAuthenticationFormServlet"
  val ORG_APACHE_SLING_AUTH_CORE_SPI_AUTHENTICATIONHANDLER: String = "org.apache.sling.auth.core.spi.AuthenticationHandler"
  val ORG_APACHE_SLING_AUTH_CORE_SPI_AUTHENTICATIONINFO: String = "org.apache.sling.auth.core.spi.AuthenticationInfo"
  val ORG_APACHE_SLING_AUTH_CORE_SPI_AUTHENTICATIONINFOPOSTPROCESSOR: String = "org.apache.sling.auth.core.spi.AuthenticationInfoPostProcessor"
  val ORG_APACHE_SLING_COMMONS_COMPILER_OPTIONS: String = "org.apache.sling.commons.compiler.Options"
  val ORG_APACHE_SLING_COMMONS_JSON_HTTP_HTTP: String = "org.apache.sling.commons.json.http.HTTP"
  val ORG_APACHE_SLING_COMMONS_JSON_IO_JSONRENDERER_OPTIONS: String = "org.apache.sling.commons.json.io.JSONRenderer.Options"
  val ORG_APACHE_SLING_COMMONS_JSON_JCR_JSONITEMWRITER: String = "org.apache.sling.commons.json.jcr.JsonItemWriter"
  val ORG_APACHE_SLING_COMMONS_LOG_LOGBACK_WEBCONSOLE_LOGPANEL: String = "org.apache.sling.commons.log.logback.webconsole.LogPanel"
  val ORG_APACHE_SLING_COMMONS_METRICS_GAUGE: String = "org.apache.sling.commons.metrics.Gauge"
  val ORG_APACHE_SLING_COMMONS_OSGI_BSNRENAMER: String = "org.apache.sling.commons.osgi.BSNRenamer"
  val ORG_APACHE_SLING_COMMONS_OSGI_BUNDLEVERSION_BUNDLEVERSIONINFO: String = "org.apache.sling.commons.osgi.bundleversion.BundleVersionInfo"
  val ORG_APACHE_SLING_COMMONS_SCHEDULER_SCHEDULER: String = "org.apache.sling.commons.scheduler.Scheduler"
  val ORG_APACHE_SLING_COMMONS_THREADS_MODIFIABLETHREADPOOLCONFIG: String = "org.apache.sling.commons.threads.ModifiableThreadPoolConfig"
  val ORG_APACHE_SLING_COMMONS_THREADS_THREADPOOLMANAGER: String = "org.apache.sling.commons.threads.ThreadPoolManager"
  val ORG_APACHE_SLING_DISCOVERY_INSTANCEDESCRIPTION: String = "org.apache.sling.discovery.InstanceDescription"
  val ORG_APACHE_SLING_DISCOVERY_PROPERTYPROVIDER: String = "org.apache.sling.discovery.PropertyProvider"
  val ORG_APACHE_SLING_DISCOVERY_COMMONS_PROVIDERS_SPI_BASE_DISCOVERYLITEDESCRIPTOR: String = "org.apache.sling.discovery.commons.providers.spi.base.DiscoveryLiteDescriptor"
  val ORG_APACHE_SLING_DISTRIBUTION_EVENT_DISTRIBUTIONEVENTPROPERTIES: String = "org.apache.sling.distribution.event.DistributionEventProperties"
  val ORG_APACHE_SLING_DISTRIBUTION_EVENT_DISTRIBUTIONEVENTTOPICS: String = "org.apache.sling.distribution.event.DistributionEventTopics"
  val ORG_APACHE_SLING_DISTRIBUTION_UTIL_DISTRIBUTIONJCRUTILS: String = "org.apache.sling.distribution.util.DistributionJcrUtils"
  val ORG_APACHE_SLING_ENGINE_ENGINECONSTANTS: String = "org.apache.sling.engine.EngineConstants"
  val ORG_APACHE_SLING_ENGINE_REQUESTLOG: String = "org.apache.sling.engine.RequestLog"
  val ORG_APACHE_SLING_ENGINE_AUTH_AUTHENTICATIONHANDLER: String = "org.apache.sling.engine.auth.AuthenticationHandler"
  val ORG_APACHE_SLING_EVENT_DEA_DEACONSTANTS: String = "org.apache.sling.event.dea.DEAConstants"
  val ORG_APACHE_SLING_HAPI_HAPIUTIL: String = "org.apache.sling.hapi.HApiUtil"
  val ORG_APACHE_SLING_HC_API_HEALTHCHECK: String = "org.apache.sling.hc.api.HealthCheck"
  val ORG_APACHE_SLING_HC_UTIL_HEALTHCHECKFILTER: String = "org.apache.sling.hc.util.HealthCheckFilter"
  val ORG_APACHE_SLING_HC_UTIL_SIMPLECONSTRAINTCHECKER: String = "org.apache.sling.hc.util.SimpleConstraintChecker"
  val ORG_APACHE_SLING_I18N_RESOURCEBUNDLEPROVIDER: String = "org.apache.sling.i18n.ResourceBundleProvider"
  val ORG_APACHE_SLING_INSTALLER_API_INSTALLABLERESOURCE: String = "org.apache.sling.installer.api.InstallableResource"
  val ORG_APACHE_SLING_INSTALLER_API_RESOURCECHANGELISTENER: String = "org.apache.sling.installer.api.ResourceChangeListener"
  val ORG_APACHE_SLING_INSTALLER_API_UPDATEHANDLER: String = "org.apache.sling.installer.api.UpdateHandler"
  val ORG_APACHE_SLING_INSTALLER_API_TASKS_INSTALLTASK: String = "org.apache.sling.installer.api.tasks.InstallTask"
  val ORG_APACHE_SLING_INSTALLER_API_TASKS_INSTALLTASKFACTORY: String = "org.apache.sling.installer.api.tasks.InstallTaskFactory"
  val ORG_APACHE_SLING_INSTALLER_API_TASKS_RESOURCETRANSFORMER: String = "org.apache.sling.installer.api.tasks.ResourceTransformer"
  val ORG_APACHE_SLING_INSTALLER_API_TASKS_TASKRESOURCE: String = "org.apache.sling.installer.api.tasks.TaskResource"
  val ORG_APACHE_SLING_INSTALLER_FACTORIES_CONFIGURATION_CONFIGURATIONCONSTANTS: String = "org.apache.sling.installer.factories.configuration.ConfigurationConstants"
  val ORG_APACHE_SLING_JCR_BASE_UTIL_REPOSITORYACCESSOR: String = "org.apache.sling.jcr.base.util.RepositoryAccessor"
  val ORG_APACHE_SLING_JCR_CONTENTLOADER_CONTENTREADER: String = "org.apache.sling.jcr.contentloader.ContentReader"
  val ORG_APACHE_SLING_JCR_CONTENTLOADER_CONTENTTYPEUTIL: String = "org.apache.sling.jcr.contentloader.ContentTypeUtil"
  val ORG_APACHE_SLING_JCR_REGISTRATION_ABSTRACTREGISTRATIONSUPPORT: String = "org.apache.sling.jcr.registration.AbstractRegistrationSupport"
  val ORG_APACHE_SLING_JCR_RESOURCE_API_JCRRESOURCECONSTANTS: String = "org.apache.sling.jcr.resource.api.JcrResourceConstants"
  val ORG_APACHE_SLING_PROVISIONING_MODEL_FEATURETYPES: String = "org.apache.sling.provisioning.model.FeatureTypes"
  val ORG_APACHE_SLING_PROVISIONING_MODEL_MODELCONSTANTS: String = "org.apache.sling.provisioning.model.ModelConstants"
  val ORG_APACHE_SLING_PROVISIONING_MODEL_IO_MODELARCHIVEWRITER: String = "org.apache.sling.provisioning.model.io.ModelArchiveWriter"
  val ORG_APACHE_SLING_RESOURCE_COLLECTION_RESOURCECOLLECTION: String = "org.apache.sling.resource.collection.ResourceCollection"
  val ORG_APACHE_SLING_RESOURCEACCESSSECURITY_RESOURCEACCESSGATE: String = "org.apache.sling.resourceaccesssecurity.ResourceAccessGate"
  val ORG_APACHE_SLING_RESOURCEMERGER_SPI_MERGEDRESOURCEPICKER: String = "org.apache.sling.resourcemerger.spi.MergedResourcePicker"
  val ORG_APACHE_SLING_RESOURCEMERGER_SPI_MERGEDRESOURCEPICKER2: String = "org.apache.sling.resourcemerger.spi.MergedResourcePicker2"
  val ORG_APACHE_SLING_REWRITER_PROCESSINGCOMPONENTCONFIGURATION: String = "org.apache.sling.rewriter.ProcessingComponentConfiguration"
  val ORG_APACHE_SLING_SCRIPTING_API_BINDINGSVALUESPROVIDER: String = "org.apache.sling.scripting.api.BindingsValuesProvider"
  val ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_DEFINEOBJECTSTAG: String = "org.apache.sling.scripting.jsp.taglib.DefineObjectsTag"
  val ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_DEFINEOBJECTSTEI: String = "org.apache.sling.scripting.jsp.taglib.DefineObjectsTEI"
  val ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_TEI_ADAPTTOTEI: String = "org.apache.sling.scripting.jsp.taglib.tei.AdaptToTEI"
  val ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_TEI_GETPROPERTYTEI: String = "org.apache.sling.scripting.jsp.taglib.tei.GetPropertyTEI"
  val ORG_APACHE_SLING_SCRIPTING_SIGHTLY_COMPILER_RUNTIMEFUNCTION: String = "org.apache.sling.scripting.sightly.compiler.RuntimeFunction"
  val ORG_APACHE_SLING_SCRIPTING_SIGHTLY_EXTENSION_RUNTIMEEXTENSION: String = "org.apache.sling.scripting.sightly.extension.RuntimeExtension"
  val ORG_APACHE_SLING_SCRIPTING_SIGHTLY_RENDER_ABSTRACTRUNTIMEOBJECTMODEL: String = "org.apache.sling.scripting.sightly.render.AbstractRuntimeObjectModel"
  val ORG_APACHE_SLING_SERVICEUSERMAPPING_SERVICEUSERMAPPED: String = "org.apache.sling.serviceusermapping.ServiceUserMapped"
  val ORG_APACHE_SLING_SERVLETS_POST_ABSTRACTPOSTRESPONSE: String = "org.apache.sling.servlets.post.AbstractPostResponse"
  val ORG_APACHE_SLING_SERVLETS_POST_JSONRESPONSE: String = "org.apache.sling.servlets.post.JSONResponse"
  val ORG_APACHE_SLING_SERVLETS_POST_POSTOPERATION: String = "org.apache.sling.servlets.post.PostOperation"
  val ORG_APACHE_SLING_SERVLETS_POST_SLINGPOSTCONSTANTS: String = "org.apache.sling.servlets.post.SlingPostConstants"
  val ORG_APACHE_SLING_SERVLETS_POST_SLINGPOSTOPERATION: String = "org.apache.sling.servlets.post.SlingPostOperation"
  val ORG_APACHE_SLING_SETTINGS_SLINGSETTINGSSERVICE: String = "org.apache.sling.settings.SlingSettingsService"
  val ORG_APACHE_SLING_SPI_RESOURCE_PROVIDER_PROVIDERCONTEXT: String = "org.apache.sling.spi.resource.provider.ProviderContext"
  val ORG_APACHE_SLING_SPI_RESOURCE_PROVIDER_RESOURCEPROVIDER: String = "org.apache.sling.spi.resource.provider.ResourceProvider"
  val ORG_APACHE_SLING_TENANT_TENANT: String = "org.apache.sling.tenant.Tenant"
  val ORG_APACHE_SLING_XSS_JSONUTIL: String = "org.apache.sling.xss.JSONUtil"
  val ORG_APACHE_TIKA_CONFIG_PARAMFIELD: String = "org.apache.tika.config.ParamField"
  val ORG_APACHE_TIKA_EMBEDDER_EXTERNALEMBEDDER: String = "org.apache.tika.embedder.ExternalEmbedder"
  val ORG_APACHE_TIKA_LANGUAGE_LANGUAGEPROFILE: String = "org.apache.tika.language.LanguageProfile"
  val ORG_APACHE_TIKA_METADATA_ACCESSPERMISSIONS: String = "org.apache.tika.metadata.AccessPermissions"
  val ORG_APACHE_TIKA_METADATA_CLIMATEFORCAST: String = "org.apache.tika.metadata.ClimateForcast"
  val ORG_APACHE_TIKA_METADATA_CREATIVECOMMONS: String = "org.apache.tika.metadata.CreativeCommons"
  val ORG_APACHE_TIKA_METADATA_DATABASE: String = "org.apache.tika.metadata.Database"
  val ORG_APACHE_TIKA_METADATA_DUBLINCORE: String = "org.apache.tika.metadata.DublinCore"
  val ORG_APACHE_TIKA_METADATA_HTML: String = "org.apache.tika.metadata.HTML"
  val ORG_APACHE_TIKA_METADATA_HTTPHEADERS: String = "org.apache.tika.metadata.HttpHeaders"
  val ORG_APACHE_TIKA_METADATA_IPTC: String = "org.apache.tika.metadata.IPTC"
  val ORG_APACHE_TIKA_METADATA_MESSAGE: String = "org.apache.tika.metadata.Message"
  val ORG_APACHE_TIKA_METADATA_METADATA: String = "org.apache.tika.metadata.Metadata"
  val ORG_APACHE_TIKA_METADATA_MSOFFICE: String = "org.apache.tika.metadata.MSOffice"
  val ORG_APACHE_TIKA_METADATA_OFFICE: String = "org.apache.tika.metadata.Office"
  val ORG_APACHE_TIKA_METADATA_OFFICEOPENXMLCORE: String = "org.apache.tika.metadata.OfficeOpenXMLCore"
  val ORG_APACHE_TIKA_METADATA_OFFICEOPENXMLEXTENDED: String = "org.apache.tika.metadata.OfficeOpenXMLExtended"
  val ORG_APACHE_TIKA_METADATA_PDF: String = "org.apache.tika.metadata.PDF"
  val ORG_APACHE_TIKA_METADATA_PHOTOSHOP: String = "org.apache.tika.metadata.Photoshop"
  val ORG_APACHE_TIKA_METADATA_QUATTROPRO: String = "org.apache.tika.metadata.QuattroPro"
  val ORG_APACHE_TIKA_METADATA_RTFMETADATA: String = "org.apache.tika.metadata.RTFMetadata"
  val ORG_APACHE_TIKA_METADATA_TIKACOREPROPERTIES: String = "org.apache.tika.metadata.TikaCoreProperties"
  val ORG_APACHE_TIKA_METADATA_TIKAMETADATAKEYS: String = "org.apache.tika.metadata.TikaMetadataKeys"
  val ORG_APACHE_TIKA_METADATA_TIKAMIMEKEYS: String = "org.apache.tika.metadata.TikaMimeKeys"
  val ORG_APACHE_TIKA_METADATA_WORDPERFECT: String = "org.apache.tika.metadata.WordPerfect"
  val ORG_APACHE_TIKA_METADATA_XMP: String = "org.apache.tika.metadata.XMP"
  val ORG_APACHE_TIKA_METADATA_XMPIDQ: String = "org.apache.tika.metadata.XMPIdq"
  val ORG_APACHE_TIKA_METADATA_XMPMM: String = "org.apache.tika.metadata.XMPMM"
  val ORG_APACHE_TIKA_METADATA_XMPRIGHTS: String = "org.apache.tika.metadata.XMPRights"
  val ORG_APACHE_TIKA_MIME_MIMETYPES: String = "org.apache.tika.mime.MimeTypes"
  val ORG_APACHE_TIKA_MIME_MIMETYPESFACTORY: String = "org.apache.tika.mime.MimeTypesFactory"
  val ORG_APACHE_TIKA_MIME_MIMETYPESREADERMETKEYS: String = "org.apache.tika.mime.MimeTypesReaderMetKeys"
  val ORG_APACHE_TIKA_PARSER_CHM_CORE_CHMCOMMONS: String = "org.apache.tika.parser.chm.core.ChmCommons"
  val ORG_APACHE_TIKA_PARSER_CHM_CORE_CHMCONSTANTS: String = "org.apache.tika.parser.chm.core.ChmConstants"
  val ORG_APACHE_TIKA_PARSER_CRYPTO_TSDPARSER: String = "org.apache.tika.parser.crypto.TSDParser"
  val ORG_APACHE_TIKA_PARSER_ENVI_ENVIHEADERPARSER: String = "org.apache.tika.parser.envi.EnviHeaderParser"
  val ORG_APACHE_TIKA_PARSER_EXECUTABLE_MACHINEMETADATA: String = "org.apache.tika.parser.executable.MachineMetadata"
  val ORG_APACHE_TIKA_PARSER_EXTERNAL_EXTERNALPARSER: String = "org.apache.tika.parser.external.ExternalParser"
  val ORG_APACHE_TIKA_PARSER_EXTERNAL_EXTERNALPARSERSCONFIGREADERMETKEYS: String = "org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys"
  val ORG_APACHE_TIKA_PARSER_GEOINFO_GEOGRAPHICINFORMATIONPARSER: String = "org.apache.tika.parser.geoinfo.GeographicInformationParser"
  val ORG_APACHE_TIKA_PARSER_GRIB_GRIBPARSER: String = "org.apache.tika.parser.grib.GribParser"
  val ORG_APACHE_TIKA_PARSER_IMAGE_ICNSPARSER: String = "org.apache.tika.parser.image.ICNSParser"
  val ORG_APACHE_TIKA_PARSER_IWORK_IWORKPACKAGEPARSER: String = "org.apache.tika.parser.iwork.IWorkPackageParser"
  val ORG_APACHE_TIKA_PARSER_IWORK_IWANA_IWORK13PACKAGEPARSER: String = "org.apache.tika.parser.iwork.iwana.IWork13PackageParser"
  val ORG_APACHE_TIKA_PARSER_MAT_MATPARSER: String = "org.apache.tika.parser.mat.MatParser"
  val ORG_APACHE_TIKA_PARSER_MBOX_MBOXPARSER: String = "org.apache.tika.parser.mbox.MboxParser"
  val ORG_APACHE_TIKA_PARSER_MICROSOFT_JACKCESSPARSER: String = "org.apache.tika.parser.microsoft.JackcessParser"
  val ORG_APACHE_TIKA_PARSER_MICROSOFT_OOXML_OOXMLWORDANDPOWERPOINTTEXTHANDLER: String = "org.apache.tika.parser.microsoft.ooxml.OOXMLWordAndPowerPointTextHandler"
  val ORG_APACHE_TIKA_PARSER_MP3_AUDIOFRAME: String = "org.apache.tika.parser.mp3.AudioFrame"
  val ORG_APACHE_TIKA_PARSER_NER_NAMEDENTITYPARSER: String = "org.apache.tika.parser.ner.NamedEntityParser"
  val ORG_APACHE_TIKA_PARSER_NER_NERECOGNISER: String = "org.apache.tika.parser.ner.NERecogniser"
  val ORG_APACHE_TIKA_PARSER_NER_CORENLP_CORENLPNERECOGNISER: String = "org.apache.tika.parser.ner.corenlp.CoreNLPNERecogniser"
  val ORG_APACHE_TIKA_PARSER_NER_MITIE_MITIENERECOGNISER: String = "org.apache.tika.parser.ner.mitie.MITIENERecogniser"
  val ORG_APACHE_TIKA_PARSER_NER_OPENNLP_OPENNLPNERECOGNISER: String = "org.apache.tika.parser.ner.opennlp.OpenNLPNERecogniser"
  val ORG_APACHE_TIKA_PARSER_NER_REGEX_REGEXNERECOGNISER: String = "org.apache.tika.parser.ner.regex.RegexNERecogniser"
  val ORG_APACHE_TIKA_PARSER_ODF_OPENDOCUMENTCONTENTPARSER: String = "org.apache.tika.parser.odf.OpenDocumentContentParser"
  val ORG_APACHE_TIKA_PARSER_PDF_PDFPARSER: String = "org.apache.tika.parser.pdf.PDFParser"
  val ORG_APACHE_TIKA_PARSER_PRT_PRTPARSER: String = "org.apache.tika.parser.prt.PRTParser"
  val ORG_APACHE_TIKA_PARSER_RECOGNITION_OBJECTRECOGNITIONPARSER: String = "org.apache.tika.parser.recognition.ObjectRecognitionParser"
  val ORG_APACHE_TIKA_PARSER_RTF_LISTDESCRIPTOR: String = "org.apache.tika.parser.rtf.ListDescriptor"
  val ORG_APACHE_TIKA_PARSER_SENTIMENT_SENTIMENTANALYSISPARSER: String = "org.apache.tika.parser.sentiment.SentimentAnalysisParser"
  val ORG_APACHE_TIKA_SAX_STANDARDSEXTRACTINGCONTENTHANDLER: String = "org.apache.tika.sax.StandardsExtractingContentHandler"
  val ORG_APACHE_TIKA_SAX_XHTMLCONTENTHANDLER: String = "org.apache.tika.sax.XHTMLContentHandler"
  val ORG_APACHE_TIKA_SAX_XMPCONTENTHANDLER: String = "org.apache.tika.sax.XMPContentHandler"
  val ORG_JODA_TIME_DATETIMECONSTANTS: String = "org.joda.time.DateTimeConstants"
  val ORG_JODA_TIME_MONTHDAY: String = "org.joda.time.MonthDay"
  val ORG_JODA_TIME_MUTABLEDATETIME: String = "org.joda.time.MutableDateTime"
  val ORG_JODA_TIME_TIMEOFDAY: String = "org.joda.time.TimeOfDay"
  val ORG_JODA_TIME_YEARMONTH: String = "org.joda.time.YearMonth"
  val ORG_JODA_TIME_YEARMONTHDAY: String = "org.joda.time.YearMonthDay"
  val ORG_JODA_TIME_CHRONO_BUDDHISTCHRONOLOGY: String = "org.joda.time.chrono.BuddhistChronology"
  val ORG_JODA_TIME_CHRONO_COPTICCHRONOLOGY: String = "org.joda.time.chrono.CopticChronology"
  val ORG_JODA_TIME_CHRONO_ETHIOPICCHRONOLOGY: String = "org.joda.time.chrono.EthiopicChronology"
  val ORG_JODA_TIME_CHRONO_ISLAMICCHRONOLOGY: String = "org.joda.time.chrono.IslamicChronology"
  val ORG_KOHSUKE_RNGOM_RNGPARSER_AST_BUILDER_GRAMMARSECTION: String = "org.kohsuke.rngom.rngparser.ast.builder.GrammarSection"
  val ORG_KOHSUKE_RNGOM_RNGPARSER_PARSE_COMPACT_UCODE_UCODEESC_CHARSTREAM: String = "org.kohsuke.rngom.rngparser.parse.compact.UCode_UCodeESC_CharStream"
  val ORG_OSGI_JMX_JMXCONSTANTS: String = "org.osgi.jmx.JmxConstants"
  val ORG_OSGI_JMX_FRAMEWORK_BUNDLESTATEMBEAN: String = "org.osgi.jmx.framework.BundleStateMBean"
  val ORG_OSGI_JMX_FRAMEWORK_FRAMEWORKMBEAN: String = "org.osgi.jmx.framework.FrameworkMBean"
  val ORG_OSGI_JMX_FRAMEWORK_PACKAGESTATEMBEAN: String = "org.osgi.jmx.framework.PackageStateMBean"
  val ORG_OSGI_JMX_FRAMEWORK_SERVICESTATEMBEAN: String = "org.osgi.jmx.framework.ServiceStateMBean"
  val ORG_OSGI_JMX_FRAMEWORK_WIRING_BUNDLEWIRINGSTATEMBEAN: String = "org.osgi.jmx.framework.wiring.BundleWiringStateMBean"
  val ORG_OSGI_JMX_SERVICE_CM_CONFIGURATIONADMINMBEAN: String = "org.osgi.jmx.service.cm.ConfigurationAdminMBean"
  val ORG_OSGI_JMX_SERVICE_PERMISSIONADMIN_PERMISSIONADMINMBEAN: String = "org.osgi.jmx.service.permissionadmin.PermissionAdminMBean"
  val ORG_OSGI_JMX_SERVICE_PROVISIONING_PROVISIONINGSERVICEMBEAN: String = "org.osgi.jmx.service.provisioning.ProvisioningServiceMBean"
  val ORG_OSGI_JMX_SERVICE_USERADMIN_USERADMINMBEAN: String = "org.osgi.jmx.service.useradmin.UserAdminMBean"
  val ORG_OSGI_SERVICE_COMPONENT_COMPONENTCONSTANTS: String = "org.osgi.service.component.ComponentConstants"
  val ORG_OSGI_SERVICE_COMPONENT_RUNTIME_DTO_COMPONENTCONFIGURATIONDTO: String = "org.osgi.service.component.runtime.dto.ComponentConfigurationDTO"
  val ORG_SLF4J_LOGGER: String = "org.slf4j.Logger"
  val ORG_SLF4J_MARKER: String = "org.slf4j.Marker"
  val ORG_SLF4J_EVENT_EVENTCONSTANTS: String = "org.slf4j.event.EventConstants"
  val ORG_SLF4J_SPI_LOCATIONAWARELOGGER: String = "org.slf4j.spi.LocationAwareLogger"

  /**
   * List of all OOTB constant holder classes.
   */
  val ALL: List<String> = listOf(
      CH_RANDELSHOFER_MEDIA_JPEG_JFIFINPUTSTREAM,
      COM_ADOBE_CQ_ADDRESS_API_ADDRESS,
      COM_ADOBE_CQ_ADDRESS_API_LOCATION_LOCATION,
      COM_ADOBE_CQ_CLOUDSERVICES_PROVISIONING_PROVISIONINGHANDLER,
      COM_ADOBE_CQ_CLOUDSERVICES_PROVISIONING_PROVISIONINGPROPERTIES,
      COM_ADOBE_CQ_COMMERCE_API_COMMERCECONSTANTS,
      COM_ADOBE_CQ_COMMERCE_API_COMMERCEQUERY,
      COM_ADOBE_CQ_COMMERCE_API_COMMERCESERVICEFACTORY,
      COM_ADOBE_CQ_COMMERCE_API_COMMERCESESSION,
      COM_ADOBE_CQ_COMMERCE_API_PRICEINFO,
      COM_ADOBE_CQ_COMMERCE_API_PRODUCT,
      COM_ADOBE_CQ_COMMERCE_API_PRODUCTRELATIONSHIPSPROVIDER,
      COM_ADOBE_CQ_COMMERCE_API_PROMOTION_PROMOTION,
      COM_ADOBE_CQ_COMMERCE_API_PROMOTION_PROMOTIONHANDLER,
      COM_ADOBE_CQ_COMMERCE_COMMON_COMMERCESEARCHPROVIDER,
      COM_ADOBE_CQ_COMMERCE_COMMON_COOKIEUTIL,
      COM_ADOBE_CQ_COMMERCE_COMMON_FACETPARAMHELPER,
      COM_ADOBE_CQ_COMMERCE_COMMON_PRICEFILTER,
      COM_ADOBE_CQ_COMMERCE_COMMON_PROMOTION_ABSTRACTJCRVOUCHER,
      COM_ADOBE_CQ_COMMERCE_PIM_API_CATALOGBLUEPRINTIMPORTER,
      COM_ADOBE_CQ_COMMERCE_PIM_API_CATALOGGENERATOR,
      COM_ADOBE_CQ_COMMERCE_PIM_API_PRODUCTIMPORTER,
      COM_ADOBE_CQ_COMMERCE_PIM_COMMON_ABSTRACTIMPORTER,
      COM_ADOBE_CQ_COMMERCE_PIM_COMMON_ABSTRACTPRODUCTIMPORTER,
      COM_ADOBE_CQ_DAM_CFM_BASICDATATYPE,
      COM_ADOBE_CQ_EXPORT_JSON_EXPORTERCONSTANTS,
      COM_ADOBE_CQ_MCM_CAMPAIGN_CONSTANTS,
      COM_ADOBE_CQ_MCM_SALESFORCE_SALESFORCECLIENT,
      COM_ADOBE_CQ_MCM_SALESFORCE_SALESFORCEEXPORTPROCESS,
      COM_ADOBE_CQ_MCM_SALESFORCE_SALESFORCELEADSEARCH,
      COM_ADOBE_CQ_SCHEDULED_EXPORTER_EXPORTER,
      COM_ADOBE_CQ_SCHEDULED_EXPORTER_SCHEDULEDEXPORTER,
      COM_ADOBE_CQ_SCHEDULED_EXPORTER_PROCESS_EXTRACTEXPORTDATAPROCESS,
      COM_ADOBE_CQ_SCREENS_BINDING_DEVICECONSTANTS,
      COM_ADOBE_CQ_SCREENS_BINDING_DEVICECONSTANTS_COMMANDS,
      COM_ADOBE_CQ_SCREENS_BINDING_SCREENSCONSTANTS,
      COM_ADOBE_CQ_SCREENS_IMPL_AEMIO_SCREENSMODELLOOKUP,
      COM_ADOBE_CQ_SIGHTLY_WCMBINDINGS,
      COM_ADOBE_CQ_SIGHTLY_WCMRESOURCEOPTIONS,
      COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_API_SOCIALACTIVITYEVENTCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_API_SOCIALJSONCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_LISTENER_API_ACTIVITYSTREAMPROVIDER,
      COM_ADOBE_CQ_SOCIAL_BADGING_API_BADGINGSERVICE,
      COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_API_CALENDAR,
      COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_API_CALENDARACTIONSEVENT,
      COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_ENDPOINTS_CALENDARREQUESTCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_API_COMMENT,
      COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_API_COMMENTCOLLECTIONCONFIGURATION,
      COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_ENDPOINTS_ABSTRACTCOMMENTOPERATIONSERVICE,
      COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_LISTING_COMMENTSOCIALCOMPONENTLIST,
      COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_SEARCH_SEARCHCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_SEARCH_SEARCHRESULTCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_COMMENTEMAILBUILDER,
      COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_EMAILCLIENTPROVIDER,
      COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_EMAILREPLYCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_COMMONS_EVENTS_COMMENTEVENT,
      COM_ADOBE_CQ_SOCIAL_COMMONS_LISTING_QUERYFILTERUTIL,
      COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_API_ABSTRACTMODERATIONOPERATION,
      COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_API_MODERATIONOPERATIONEXTENSION,
      COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_API_MODERATIONOPERATIONS,
      COM_ADOBE_CQ_SOCIAL_COMMONS_MODERATION_EVENTS_MODERATIONEVENT,
      COM_ADOBE_CQ_SOCIAL_COMMONS_TAGCLOUD_API_TAGCLOUD,
      COM_ADOBE_CQ_SOCIAL_COMMONS_TAGCLOUD_API_TAGCLOUDTAG,
      COM_ADOBE_CQ_SOCIAL_COMMUNITY_API_COMMUNITYCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_GROUP_API_ENABLEMENTGROUPCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHPREREQUISITE,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHRESOURCE,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_MODEL_API_ENABLEMENTLEARNINGPATHRESOURCES,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHRATINGREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHRESOURCEREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHUSERCOMPLETIONREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHUSERDETAILREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_REPORTING_API_ENABLEMENTLEARNINGPATHUSERENROLLMENTREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_REPORTING_MODEL_API_ENABLEMENTRESOURCEAGGREGATEREPORTMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_REPORTING_MODEL_API_ENABLEMENTRESOURCEREPORTMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_REPORTING_MODEL_API_ENABLEMENTRESOURCEUSERREPORTMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTASSETMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTASSETSMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLE,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLEGROUP,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLES,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTAUTHORIZABLEUSER,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTCARDIMAGE,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTRESOURCEMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTRESOURCEMODELLIST,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTRESOURCEREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTSOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_MODEL_API_ENABLEMENTSOCIALMODEL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTREPORTGROUPENROLLMENTLIST,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEANALYTICSREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEASSIGNMENTSTATUS,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEENROLLMENTREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEENROLLMENTSTATUSREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCERATINGSREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCETRENDREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEVIDEOCLIENTREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEVIDEODROPOFFREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_REPORTING_API_ENABLEMENTRESOURCEVIDEOTRACKING,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_API_ENABLEMENTSITE,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_API_ENABLEMENTSITECATALOG,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_API_ENABLEMENTSITECOLLECTION,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_REPORTING_API_ENABLEMENTAGGREGATERESOURCERATINGREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_REPORTING_API_ENABLEMENTAGGREGATERESOURCEREPORT,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SITE_REPORTING_API_ENABLEMENTREPORTUSERENROLLMENTLIST,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_USER_API_ENABLEMENTCOMMUNITYSIMPLEUSER,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTLEARNINGPATHVIEW,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTLEARNINGPATHVIEWDETAIL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTRESOURCEVIEW,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTRESOURCEVIEWDETAIL,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTSITEASSIGNMENTSVIEW,
      COM_ADOBE_CQ_SOCIAL_ENABLEMENT_VIEW_API_ENABLEMENTSITECATALOGVIEW,
      COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_ASSET,
      COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_FILELIBRARY,
      COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_FILELIBRARYCONFIGURATION,
      COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_API_FILELIBRARYEVENT,
      COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_ENDPOINTS_FILELIBRARYDOWNLOADGETSERVLET,
      COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_FORUM,
      COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_FORUMCONFIGURATION,
      COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_FORUMEVENT,
      COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_API_POST,
      COM_ADOBE_CQ_SOCIAL_GRAPH_EDGE,
      COM_ADOBE_CQ_SOCIAL_GRAPH_CLIENT_API_FOLLOWING,
      COM_ADOBE_CQ_SOCIAL_GRAPH_CLIENT_API_RELATIONSHIPCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_GROUP_API_GROUPCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_GROUP_API_GROUPSERVICE,
      COM_ADOBE_CQ_SOCIAL_GROUP_API_GROUPUTIL,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUP,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPFOLDER,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPMEMBERLISTCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_API_COMMUNITYGROUPUSER,
      COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_ENDPOINTS_ABSTRACTCOMMUNITYGROUPOPERATIONSERVICE,
      COM_ADOBE_CQ_SOCIAL_HANDLEBARS_API_TEMPLATECONTEXTPROVIDER,
      COM_ADOBE_CQ_SOCIAL_HANDLEBARS_API_TEMPLATEHELPER,
      COM_ADOBE_CQ_SOCIAL_HANDLEBARS_API_TEMPLATEHELPERSSERVICE,
      COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_API_IDEACOMMENT,
      COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_API_IDEATION,
      COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_API_IDEATIONEVENT,
      COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNAL,
      COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNALENTRYCOMMENT,
      COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNALEVENT,
      COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_API_JOURNALSIDEBAR,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUP,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUPCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUPMEMBERS,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERGROUPPROFILE,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERUSER,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERUSERCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_API_COMMUNITYMEMBERUSERPROFILE,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_COMMUNITYMEMBERGROUPPROFILEOPERATIONS,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_COMMUNITYMEMBERSTUNNELVALIDATOR,
      COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_COMMUNITYMEMBERUSERPROFILEOPERATIONS,
      COM_ADOBE_CQ_SOCIAL_MESSAGING_API_MESSAGINGSOCIALEVENT,
      COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_API_MESSAGEBOXSOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_API_MESSAGESOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_API_MESSAGINGUSER,
      COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_ENDPOINTS_MESSAGINGOPERATIONS,
      COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_COMMUNITIESCONTENTFRAGMENT,
      COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_FILTERGROUP,
      COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_FILTERGROUPSOCIALCOMPONENTFACTORY,
      COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_MODERATIONDASHBOARD,
      COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_USERDETAILS,
      COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_API_NOTIFICATIONCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CHANNEL_CHANNEL,
      COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CHANNEL_CHANNELEXTENSION,
      COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CLIENT_API_SOCIALNOTIFICATION,
      COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_CLIENT_API_SOCIALNOTIFICATIONCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_API_QNAEVENT,
      COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_API_QNAPOST,
      COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_API_QNAPOSTCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSCOMMUNITYACTIVITY,
      COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSCOMMUNITYACTIVITYCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSCOMPONENTCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_ANALYTICSFRAMEWORKCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_API_SITETRENDREPORT,
      COM_ADOBE_CQ_SOCIAL_REVIEW_CLIENT_API_REVIEWCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_REVIEW_CLIENT_API_REVIEWEVENT,
      COM_ADOBE_CQ_SOCIAL_SCF_CLIENTUTILITIES,
      COM_ADOBE_CQ_SOCIAL_SCF_COLLECTIONPAGINATION,
      COM_ADOBE_CQ_SOCIAL_SCF_OPERATIONEXTENSION,
      COM_ADOBE_CQ_SOCIAL_SCF_QUERYREQUESTINFO,
      COM_ADOBE_CQ_SOCIAL_SCF_SOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_SCF_SOCIALGROUP,
      COM_ADOBE_CQ_SOCIAL_SCF_USER,
      COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYAUTHORIZABLECOLLECTION,
      COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYSIMPLEAUTHORIZABLECOLLECTION,
      COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYSITETRANSLATIONCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_SCF_COMMUNITY_COMMUNITYUSER,
      COM_ADOBE_CQ_SOCIAL_SCF_CORE_SOCIALEVENT,
      COM_ADOBE_CQ_SOCIAL_SCF_UTILITIES_INTERNAL_INTERNALSCFUTILITIES,
      COM_ADOBE_CQ_SOCIAL_SCORING_API_SCORINGCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_SRP_APICOMMAND,
      COM_ADOBE_CQ_SOCIAL_SRP_FACETRANGEFIELD,
      COM_ADOBE_CQ_SOCIAL_SRP_SOCIALRESOURCEPROVIDER,
      COM_ADOBE_CQ_SOCIAL_SRP_CONFIG_DSRPCONFIGURATION,
      COM_ADOBE_CQ_SOCIAL_SRP_CONFIG_MSRPCONFIGURATION,
      COM_ADOBE_CQ_SOCIAL_SRP_CONFIG_SOCIALRESOURCECONFIGURATION,
      COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_ABSTRACTCACHE,
      COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_ABSTRACTSCHEMAMAPPER,
      COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_CACHINGRESOURCEPROVIDER,
      COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_ERRORRESULT,
      COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_SOCIALINDEXER,
      COM_ADOBE_CQ_SOCIAL_SRP_INTERNAL_SOCIALRESOURCEUTILS,
      COM_ADOBE_CQ_SOCIAL_SRP_UTILITIES_INTERNAL_INTERNALSOCIALRESOURCEUTILITIES,
      COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_API_SUBSCRIPTION,
      COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_CLIENT_API_SUBSCRIPTIONCOLLECTION,
      COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_CLIENT_API_USERSUBSCRIPTIONPREFERENCES,
      COM_ADOBE_CQ_SOCIAL_SUBSCRIPTIONS_ENDPOINT_SUBSCRIPTIONCOLLECTIONOPERATIONS,
      COM_ADOBE_CQ_SOCIAL_TALLY_LIKING,
      COM_ADOBE_CQ_SOCIAL_TALLY_POLL,
      COM_ADOBE_CQ_SOCIAL_TALLY_TALLYCONSTANTS,
      COM_ADOBE_CQ_SOCIAL_TALLY_VOTING,
      COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_LIKINGSOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_RATINGSOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_TALLYEVENT,
      COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_API_VOTINGSOCIALCOMPONENT,
      COM_ADOBE_CQ_SOCIAL_TALLY_CLIENT_ENDPOINTS_TALLYOPERATIONSSERVICE,
      COM_ADOBE_CQ_SOCIAL_UGC_API_ABSTRACTUGCNODEINDEXEREXTENSION,
      COM_ADOBE_CQ_SOCIAL_UGC_API_UGCFILTER,
      COM_ADOBE_CQ_SOCIAL_UGCBASE_COLLABUSER,
      COM_ADOBE_CQ_SOCIAL_UGCBASE_SOCIALUTILS,
      COM_ADOBE_CQ_SOCIAL_UGCBASE_CORE_SOCIALRESOURCEUTILS,
      COM_ADOBE_CQ_SOCIAL_UGCBASE_SECURITY_ATTACHMENTTYPEBLACKLISTSERVICE,
      COM_ADOBE_CQ_SOCIAL_UGCBASE_SECURITY_SAFERSLINGPOSTVALIDATOR,
      COM_ADOBE_CQ_UPGRADES_BACKUP_BACKUPCONSTANTS,
      COM_ADOBE_CQ_UPGRADESEXECUTOR_ACTIVATOR,
      COM_ADOBE_CQ_XF_EXPERIENCEFRAGMENTSCONSTANTS,
      COM_ADOBE_CQ_XF_UI_EXPERIENCEFRAGMENTDATASOURCE,
      COM_ADOBE_DAM_PRINT_IDS_STRINGCONSTANTS,
      COM_ADOBE_GRANITE_ACTIVITYSTREAMS_ACTIVITYEVENTCONSTANTS,
      COM_ADOBE_GRANITE_ACTIVITYSTREAMS_JSONCONSTANTS,
      COM_ADOBE_GRANITE_ACTIVITYSTREAMS_OBJECTTYPES,
      COM_ADOBE_GRANITE_ACTIVITYSTREAMS_VERBS,
      COM_ADOBE_GRANITE_ASSET_API_RENDITIONHANDLER,
      COM_ADOBE_GRANITE_AUTH_OAUTH_ACCESSTOKENPROVIDERCONSTANTS,
      COM_ADOBE_GRANITE_AUTH_OAUTH_ACCESSTOKENREQUESTCUSTOMIZER,
      COM_ADOBE_GRANITE_AUTH_OAUTH_CREDENTIALSVALIDATOR,
      COM_ADOBE_GRANITE_AUTH_OAUTH_OAUTHCONSTANTS,
      COM_ADOBE_GRANITE_AUTH_OAUTH_PROVIDERCONFIGPROPERTIES,
      COM_ADOBE_GRANITE_AUTH_OAUTH_TOKENVALIDATOR,
      COM_ADOBE_GRANITE_AUTH_SAML_MODEL_SAMLCONSTANTS,
      COM_ADOBE_GRANITE_AUTH_SAML_MODEL_XML_SAMLXMLCONSTANTS,
      COM_ADOBE_GRANITE_AUTH_SAML_UTIL_SAMLWRITER,
      COM_ADOBE_GRANITE_CLOUDSETTINGS_CLOUDSETTINGSUTIL,
      COM_ADOBE_GRANITE_COMMENTS_ABSTRACTCOMMENTINGPROVIDER,
      COM_ADOBE_GRANITE_COMMENTS_COMMENTINGEVENT,
      COM_ADOBE_GRANITE_COMMENTS_COMMENTINGPROVIDER,
      COM_ADOBE_GRANITE_CONFMGR_CONFCONSTANTS,
      COM_ADOBE_GRANITE_CRYPTO_CRYPTOSUPPORT,
      COM_ADOBE_GRANITE_CRYPTO_SPI_KEYPROVIDER,
      COM_ADOBE_GRANITE_HAF_CONVERTER_API_CONVERTERCONTEXT,
      COM_ADOBE_GRANITE_HAF_CONVERTER_API_HYPERMEDIACONVERTER,
      COM_ADOBE_GRANITE_HAF_CONVERTER_PLATFORM_API_PLATFORMCONVERTERSERVICE,
      COM_ADOBE_GRANITE_KEYSTORE_KEYSTORESERVICE,
      COM_ADOBE_GRANITE_LICENSE_LICENSE,
      COM_ADOBE_GRANITE_MAINTENANCE_MAINTENANCECONSTANTS,
      COM_ADOBE_GRANITE_OAUTH_JWT_JWTCONSTANTS,
      COM_ADOBE_GRANITE_OMNISEARCH_API_CORE_OMNISEARCHSERVICE,
      COM_ADOBE_GRANITE_OMNISEARCH_COMMONS_ABSTRACTOMNISEARCHHANDLER,
      COM_ADOBE_GRANITE_OPERATIONS_OPERATIONSSERVICE,
      COM_ADOBE_GRANITE_REST_APIRESOURCEPROVIDERFACTORY,
      COM_ADOBE_GRANITE_REST_CONSTANTS,
      COM_ADOBE_GRANITE_REST_CONVERTER_RESOURCECONVERTERCONTEXT,
      COM_ADOBE_GRANITE_REST_CONVERTER_SIREN_ABSTRACTSIRENCONVERTER,
      COM_ADOBE_GRANITE_REST_FILTER_FILTERFACTORY,
      COM_ADOBE_GRANITE_SECURITY_USER_SSLCONFIGURATIONSERVICE,
      COM_ADOBE_GRANITE_SECURITY_USER_USERPROPERTIES,
      COM_ADOBE_GRANITE_SECURITY_USER_USERPROPERTIESMANAGER,
      COM_ADOBE_GRANITE_SECURITY_USER_USERPROPERTIESSERVICE,
      COM_ADOBE_GRANITE_SECURITY_USER_UTIL_PROPCONSTANTS,
      COM_ADOBE_GRANITE_SOCKETIO_SOCKETIONAMESPACE,
      COM_ADOBE_GRANITE_TASKMANAGEMENT_TASK,
      COM_ADOBE_GRANITE_TASKMANAGEMENT_TASKEVENT,
      COM_ADOBE_GRANITE_TRANSLATION_API_TRANSLATIONCONFIG,
      COM_ADOBE_GRANITE_TRANSLATION_API_TRANSLATIONCONSTANTS_TRANSLATIONRELATIONSHIPS,
      COM_ADOBE_GRANITE_TRANSLATION_API_TRANSLATIONSERVICEFACTORY,
      COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_MICROSOFTTRANSLATIONCLOUDCONFIG,
      COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_UI_UTILS_MICROSOFTCLOUDSERVICEUTILS,
      COM_ADOBE_GRANITE_TRANSLATION_CORE_MACHINETRANSLATIONCLOUDCONFIG,
      COM_ADOBE_GRANITE_UI_CLIENTLIBS_HTMLLIBRARYMANAGER,
      COM_ADOBE_GRANITE_UI_CLIENTLIBS_SCRIPT_SCRIPTPROCESSOR,
      COM_ADOBE_GRANITE_UI_COMPONENTS_VALUE,
      COM_ADOBE_GRANITE_WORKFLOW_PAYLOADMAP,
      COM_ADOBE_GRANITE_WORKFLOW_COLLECTION_RESOURCECOLLECTION,
      COM_ADOBE_GRANITE_WORKFLOW_EVENT_WORKFLOWEVENT,
      COM_ADOBE_GRANITE_WORKFLOW_EXEC_PARTICIPANTSTEPCHOOSER,
      COM_ADOBE_GRANITE_WORKFLOW_JOB_ABSOLUTETIMEOUTHANDLER,
      COM_ADOBE_GRANITE_WORKFLOW_JOB_EXTERNALPROCESSJOB,
      COM_ADOBE_GRANITE_WORKFLOW_JOB_TIMEOUTJOB,
      COM_ADOBE_GRANITE_WORKFLOW_JOB_WORKFLOWJOB,
      COM_ADOBE_GRANITE_WORKFLOW_MODEL_WORKFLOWMODELSERIALIZER,
      COM_ADOBE_GRANITE_WORKFLOW_MODEL_WORKFLOWNODE,
      COM_ADOBE_GRANITE_XSS_JSONUTIL,
      COM_ADOBE_INTERNAL_XMP_XMPCONST,
      COM_ADOBE_INTERNAL_XMP_XMPERROR,
      COM_ADOBE_INTERNAL_XMP_OPTIONS_ALIASOPTIONS,
      COM_ADOBE_INTERNAL_XMP_OPTIONS_ITERATOROPTIONS,
      COM_ADOBE_INTERNAL_XMP_OPTIONS_PARSEOPTIONS,
      COM_ADOBE_INTERNAL_XMP_OPTIONS_PROPERTYOPTIONS,
      COM_ADOBE_INTERNAL_XMP_OPTIONS_SERIALIZEOPTIONS,
      COM_ADOBE_INTERNAL_XMP_OPTIONS_TEMPLATEOPTIONS,
      COM_ADOBE_SOCIAL_INTEGRATIONS_LIVEFYRE_CONFIG_API_LIVEFYRECONFIGPROVIDER,
      COM_ADOBE_SOCIAL_INTEGRATIONS_LIVEFYRE_USER_API_PINGFORPULLUSER,
      COM_ADOBE_VERSIONCUE_NATIVECOMM_IO_ISERIALIZER,
      COM_ADOBE_VERSIONCUE_NATIVECOMM_MSG_NCTYPE,
      COM_ADOBE_XMP_XMPCONST,
      COM_ADOBE_XMP_XMPERROR,
      COM_ADOBE_XMP_CORE_NAMESPACE_ADOBEPDF,
      COM_ADOBE_XMP_CORE_NAMESPACE_CAMERARAW,
      COM_ADOBE_XMP_CORE_NAMESPACE_DUBLINCORE,
      COM_ADOBE_XMP_CORE_NAMESPACE_EXIFSCHEMAFORADDITIONALEXIF,
      COM_ADOBE_XMP_CORE_NAMESPACE_EXIFSCHEMAFOREXIF,
      COM_ADOBE_XMP_CORE_NAMESPACE_EXIFSCHEMAFORTIFF,
      COM_ADOBE_XMP_CORE_NAMESPACE_PHOTOSHOP,
      COM_ADOBE_XMP_CORE_NAMESPACE_RDF,
      COM_ADOBE_XMP_CORE_NAMESPACE_RESOURCEEVENT,
      COM_ADOBE_XMP_CORE_NAMESPACE_RESOURCEREF,
      COM_ADOBE_XMP_CORE_NAMESPACE_XML,
      COM_ADOBE_XMP_CORE_NAMESPACE_XMPBASIC,
      COM_ADOBE_XMP_CORE_NAMESPACE_XMPBASICJOBTICKET,
      COM_ADOBE_XMP_CORE_NAMESPACE_XMPDYNAMICMEDIA,
      COM_ADOBE_XMP_CORE_NAMESPACE_XMPMEDIAMANAGEMENT,
      COM_ADOBE_XMP_CORE_NAMESPACE_XMPPAGEDTEXT,
      COM_ADOBE_XMP_CORE_NAMESPACE_XMPRIGHTSMANAGEMENT,
      COM_ADOBE_XMP_CORE_PARSER_RDFXMLPARSERCONTEXT,
      COM_ADOBE_XMP_CORE_SERIALIZER_RDFXMLSERIALIZERCONTEXT,
      COM_ADOBE_XMP_OPTIONS_ALIASOPTIONS,
      COM_ADOBE_XMP_OPTIONS_ITERATOROPTIONS,
      COM_ADOBE_XMP_OPTIONS_PARSEOPTIONS,
      COM_ADOBE_XMP_OPTIONS_PROPERTYOPTIONS,
      COM_ADOBE_XMP_OPTIONS_SERIALIZEOPTIONS,
      COM_ADOBE_XMP_SCHEMA_MODEL_SIMPLETYPE,
      COM_DAY_CQ_ANALYTICS_SITECATALYST_ANALYTICSPAGENAMECONTEXT,
      COM_DAY_CQ_ANALYTICS_SITECATALYST_SITECATALYSTWEBSERVICE,
      COM_DAY_CQ_ANALYTICS_SITECATALYST_UTIL_HTTPCLIENTUTILS,
      COM_DAY_CQ_ANALYTICS_TESTANDTARGET_UTIL_CONSTANTS,
      COM_DAY_CQ_ANALYTICS_TESTANDTARGET_UTIL_OFFERHELPER,
      COM_DAY_CQ_AUDIT_AUDITLOGEVENT,
      COM_DAY_CQ_AUDIT_AUDITLOGPURGERULE,
      COM_DAY_CQ_COMMONS_DIFFSERVICE,
      COM_DAY_CQ_COMMONS_DOWNLOADRESOURCE,
      COM_DAY_CQ_COMMONS_EXTERNALIZER,
      COM_DAY_CQ_COMMONS_IMAGERESOURCE,
      COM_DAY_CQ_COMMONS_JSONWRITERUTIL,
      COM_DAY_CQ_COMMONS_LANGUAGEUTIL,
      COM_DAY_CQ_COMMONS_RUNMODEUTIL,
      COM_DAY_CQ_COMMONS_SYMMETRICCRYPT,
      COM_DAY_CQ_COMMONS_DATE_RELATIVETIMEFORMAT,
      COM_DAY_CQ_COMMONS_FEED_FEED,
      COM_DAY_CQ_COMMONS_JCR_JCRCONSTANTS,
      COM_DAY_CQ_COMMONS_JCR_JCRRECURSIVEREMOVE,
      COM_DAY_CQ_COMMONS_JCR_JCRUTIL,
      COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTCOMMANDSERVLET,
      COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTLISTSERVLET,
      COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTLISTSERVLET_LISTITEM,
      COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTPREDICATESERVLET,
      COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTREPLICABLELISTSERVLET,
      COM_DAY_CQ_COMMONS_SERVLETS_ABSTRACTSEARCHSERVLET,
      COM_DAY_CQ_COMMONS_SERVLETS_FEEDRENDERERSERVLET,
      COM_DAY_CQ_COMMONS_SERVLETS_OVERLAYSERVLET,
      COM_DAY_CQ_COMPAT_CODEUPGRADE_MIGRATIONMODECHECK,
      COM_DAY_CQ_CONTENTSYNC_CONTENTSYNCCONSTANTS,
      COM_DAY_CQ_CONTENTSYNC_HANDLER_ABSTRACTDEFAULTCONTENTUPDATEHANDLER,
      COM_DAY_CQ_DAM_API_DAMCONSTANTS,
      COM_DAY_CQ_DAM_API_DAMEVENT,
      COM_DAY_CQ_DAM_API_METADATA,
      COM_DAY_CQ_DAM_API_HANDLER_STORE_ASSETSTORE,
      COM_DAY_CQ_DAM_API_METADATA_COMPONENTHANDLER,
      COM_DAY_CQ_DAM_API_S7DAM_CONFIG_DYNAMICMEDIASERVICESCONFIG,
      COM_DAY_CQ_DAM_API_S7DAM_CONFIG_S7DAMYOUTUBEACCOUNTCONFIG,
      COM_DAY_CQ_DAM_API_S7DAM_CONFIG_YOUTUBECHANNELCONFIG,
      COM_DAY_CQ_DAM_API_S7DAM_CONFIG_YOUTUBECONFIGURATION,
      COM_DAY_CQ_DAM_API_S7DAM_CONSTANTS_S7DAMCONSTANTS,
      COM_DAY_CQ_DAM_API_S7DAM_JOBS_S7DAMEXPORTSERVICE,
      COM_DAY_CQ_DAM_API_S7DAM_SET_CAROUSELSET,
      COM_DAY_CQ_DAM_API_THUMBNAIL_THUMBNAILCONFIG,
      COM_DAY_CQ_DAM_COMMONS_HANDLER_STANDARDIMAGEHANDLER,
      COM_DAY_CQ_DAM_COMMONS_METADATA_SIMPLEXMPTOJCRMETADATABUILDER,
      COM_DAY_CQ_DAM_COMMONS_METADATA_XMPFILTERBLACKWHITE,
      COM_DAY_CQ_DAM_COMMONS_METADATA_XMPTOJCRMETADATABUILDER,
      COM_DAY_CQ_DAM_COMMONS_PROCESS_ABSTRACTASSETWORKFLOWPROCESS,
      COM_DAY_CQ_DAM_COMMONS_PROXY_PROXYCONFIG,
      COM_DAY_CQ_DAM_COMMONS_UTIL_DAMCONFIGURATIONCONSTANTS,
      COM_DAY_CQ_DAM_COMMONS_UTIL_DAMLANGUAGEUTIL,
      COM_DAY_CQ_DAM_COMMONS_UTIL_ORIENTATIONUTIL,
      COM_DAY_CQ_DAM_COMMONS_UTIL_S73DCONSTANTS,
      COM_DAY_CQ_DAM_COMMONS_WATERMARK_FONT,
      COM_DAY_CQ_DAM_COMMONS_WATERMARK_TEXTWATERMARK,
      COM_DAY_CQ_DAM_COMMONS_WATERMARK_WATERMARK,
      COM_DAY_CQ_DAM_CORE_PROCESS_EXIFTOOLEXTRACTMETADATAPROCESS,
      COM_DAY_CQ_DAM_CORE_PROCESS_EXTRACTMETADATAPROCESS,
      COM_DAY_CQ_DAM_CORE_PROCESS_METADATAPROCESSORPROCESS,
      COM_DAY_CQ_DAM_ENTITLEMENT_API_ENTITLEMENTCONSTANTS,
      COM_DAY_CQ_DAM_HANDLER_FFMPEG_LOCATORIMPL,
      COM_DAY_CQ_DAM_HANDLER_GIBSON_FONTMANAGER_FONTMANAGEREXCEPTION,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_EPUB_EPUBHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_HELPER_IMAGEINFO_IMAGEINFO,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_KEYNOTE_KEYNOTEPRESENTATION,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_MP3_MP3HANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_MSOFFICE_MSOFFICEHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_MSOFFICE_MSPOWERPOINTHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_OOXML_MSPOWERPOINTOOXMLHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_OOXML_OPENOFFICEHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_PDF_PDFHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_PS_POSTSCRIPTHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_PSD_PSDHANDLER,
      COM_DAY_CQ_DAM_HANDLER_STANDARD_ZIP_ZIPHANDLER,
      COM_DAY_CQ_DAM_INDD_PAGEEXTRACTIONHANDLER,
      COM_DAY_CQ_DAM_SCENE7_API_S7CONFIGRESOLVER,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7APICLIENT,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7ASSETFACTORY,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7ASSETMIMETYPESERVICE,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7ENDPOINT,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7ENDPOINTSMANAGER,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7FLASHTEMPLATESSERVICE,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7PRESETSSERVICE,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7SERVICE,
      COM_DAY_CQ_DAM_SCENE7_API_SCENE7UPLOADSERVICE,
      COM_DAY_CQ_DAM_SCENE7_API_CONSTANTS_SCENE7CONSTANTS,
      COM_DAY_CQ_DAM_USAGE_API_ASSETUSAGETRACKER,
      COM_DAY_CQ_DAM_VIDEO_ABSTRACTFFMPEGPROCESS,
      COM_DAY_CQ_DAM_VIDEO_VIDEOCONSTANTS,
      COM_DAY_CQ_DAM_VIDEO_VIDEOPROFILE,
      COM_DAY_CQ_GRAPHICS_GRAPH,
      COM_DAY_CQ_GRAPHICS_CHART_AXIS,
      COM_DAY_CQ_GRAPHICS_CHART_BARCHART,
      COM_DAY_CQ_MAILER_COMMONS_PROFILEVARIABLELOOKUP,
      COM_DAY_CQ_MCM_API_BRAND,
      COM_DAY_CQ_MCM_API_CAMPAIGN,
      COM_DAY_CQ_MCM_CAMPAIGN_DEFS,
      COM_DAY_CQ_MCM_CAMPAIGN_NEWSLETTERSTATUS,
      COM_DAY_CQ_MCM_CAMPAIGN_RPCDEFS,
      COM_DAY_CQ_MCM_CAMPAIGN_IMPORTER_PERSONALIZEDTEXTHANDLERFACTORY,
      COM_DAY_CQ_MCM_CORE_NEWSLETTEREMULATORGROUP,
      COM_DAY_CQ_MCM_CORE_NEWSLETTERHELPER,
      COM_DAY_CQ_MCM_EMAILPROVIDER_ESCONSTANTS,
      COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_EMAIL,
      COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_PERSONALIZATIONINFO,
      COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_SUBSCRIBER,
      COM_DAY_CQ_MCM_EMAILPROVIDER_TYPES_SUBSCRIPTIONLIST,
      COM_DAY_CQ_MCM_EMAILPROVIDER_UTIL_EMAILHELPER,
      COM_DAY_CQ_MCM_EXACTTARGET_EXACTTARGETCONSTANTS,
      COM_DAY_CQ_MCM_LANDINGPAGE_LEADFORM_CREATOR_LEADFORMSCREATOR,
      COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_CLICKTHROUGHCOMPONENTTAGHANDLERFACTORY,
      COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_GRAPHICALCLICKTHROUGHCOMPONENTTAGHANDLERFACTORY,
      COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_LEADFORMCTACOMPONENTTAGHANDLER,
      COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_LEADFORMCTACOMPONENTTAGHANDLERFACTORY,
      COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_MBOX_MBOXEXPERIENCETAGHANDLERFACTORY,
      COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_MBOX_TARGETCOMPONENTTAGHANDLERFACTORY,
      COM_DAY_CQ_PERSONALIZATION_PROFILECONSTANTS,
      COM_DAY_CQ_PERSONALIZATION_SEGMENT,
      COM_DAY_CQ_PERSONALIZATION_TARGETRESOURCETYPEPROVIDER,
      COM_DAY_CQ_PERSONALIZATION_USERPROPERTIESPROVIDER,
      COM_DAY_CQ_PERSONALIZATION_UI_ITEMS_PERSONALIZATIONITEM,
      COM_DAY_CQ_POLLING_IMPORTER_IMPORTER,
      COM_DAY_CQ_POLLING_IMPORTER_POLLINGIMPORTER,
      COM_DAY_CQ_REPLICATION_AGENTCONFIG,
      COM_DAY_CQ_REPLICATION_CONTENTBUILDER,
      COM_DAY_CQ_REPLICATION_REPLICATIONACTION,
      COM_DAY_CQ_REPLICATION_REPLICATIONEVENT,
      COM_DAY_CQ_REPLICATION_REPLICATIONSTATUS,
      COM_DAY_CQ_REPLICATION_REPLICATOR,
      COM_DAY_CQ_REPLICATION_REVERSEREPLICATION,
      COM_DAY_CQ_REWRITER_HTMLPARSER_DOCUMENTHANDLERTOSAXADAPTER,
      COM_DAY_CQ_REWRITER_HTMLPARSER_HTMLPARSER,
      COM_DAY_CQ_REWRITER_LINKCHECKER_LINKINFO,
      COM_DAY_CQ_REWRITER_PIPELINE_ATTRIBUTESIMPL,
      COM_DAY_CQ_SEARCH_PREDICATE,
      COM_DAY_CQ_SEARCH_PREDICATECONVERTER,
      COM_DAY_CQ_SEARCH_PREDICATEGROUP,
      COM_DAY_CQ_SEARCH_SIMPLESEARCH,
      COM_DAY_CQ_SEARCH_EVAL_COLLECTIONPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_DATERANGEPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_FULLTEXTPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_JCRBOOLPROPERTYPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_JCRPROPERTYPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_NODENAMEPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_PATHPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_PERMISSIONPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_RANGEPROPERTYPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_SAVEDQUERYPREDICATE,
      COM_DAY_CQ_SEARCH_EVAL_SIMILARITYPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_TYPEPREDICATEEVALUATOR,
      COM_DAY_CQ_SEARCH_EVAL_XPATH,
      COM_DAY_CQ_SEARCH_SUGGEST_BUILDER_SEARCHINDEXSUGGESTIONEXTRACTOR_OPTIONS,
      COM_DAY_CQ_SEARCH_WRITER_SIMPLEHITWRITER,
      COM_DAY_CQ_SEARCHPROMOTE_XML_RESULT_RESULTPAGE,
      COM_DAY_CQ_SECURITY_AUTHORIZABLE,
      COM_DAY_CQ_SECURITY_USERMANAGER,
      COM_DAY_CQ_WCM_COMMONS_CONSTANTS,
      COM_DAY_CQ_WCM_COMMONS_WCMUTILS,
      COM_DAY_CQ_WCM_CONTENTSYNC_PATHREWRITEROPTIONS,
      COM_DAY_CQ_WCM_CORE_CONTENTFINDER_VIEWHANDLER,
      COM_DAY_CQ_WCM_CORE_STATS_PAGEVIEW,
      COM_DAY_CQ_WCM_CORE_STATS_PAGEVIEWPATHBUILDER,
      COM_DAY_CQ_WCM_CORE_UTILS_PAGENAMEVALIDATORSERVICE,
      COM_DAY_CQ_WCM_EMULATOR_EMULATOR,
      COM_DAY_CQ_WCM_FOUNDATION_ALLOWEDCOMPONENTLIST,
      COM_DAY_CQ_WCM_FOUNDATION_CHART,
      COM_DAY_CQ_WCM_FOUNDATION_EXTERNAL,
      COM_DAY_CQ_WCM_FOUNDATION_IMAGE,
      COM_DAY_CQ_WCM_FOUNDATION_LIST,
      COM_DAY_CQ_WCM_FOUNDATION_PARAGRAPHLIST,
      COM_DAY_CQ_WCM_FOUNDATION_PARAGRAPHSYSTEM,
      COM_DAY_CQ_WCM_FOUNDATION_PLACEHOLDER,
      COM_DAY_CQ_WCM_FOUNDATION_FORMS_FORMRESOURCEEDIT,
      COM_DAY_CQ_WCM_FOUNDATION_FORMS_FORMSCONSTANTS,
      COM_DAY_CQ_WCM_FOUNDATION_FORMS_FORMSHELPER,
      COM_DAY_CQ_WCM_FOUNDATION_MODEL_RESPONSIVEGRID_RESPONSIVECONSTANTS,
      COM_DAY_CQ_WCM_FOUNDATION_SECURITY_ATTACHMENTTYPEBLACKLISTSERVICE,
      COM_DAY_CQ_WCM_FOUNDATION_SECURITY_SAFERSLINGPOSTVALIDATOR,
      COM_DAY_CQ_WCM_MOBILE_API_MOBILECONSTANTS,
      COM_DAY_CQ_WCM_MOBILE_API_DEVICE_DEVICEGROUP,
      COM_DAY_CQ_WCM_MOBILE_API_DEVICE_DEVICEGROUPPROVIDER,
      COM_DAY_CQ_WCM_MOBILE_API_DEVICESPECS_DEVICESPECSCONSTANTS,
      COM_DAY_CQ_WCM_MSM_API_LIVEACTIONFACTORY,
      COM_DAY_CQ_WCM_MSM_API_MSMNAMECONSTANTS,
      COM_DAY_CQ_WCM_MSM_COMMONS_ITEMFILTERUTIL,
      COM_DAY_CQ_WCM_SCRIPTING_WCMBINDINGSCONSTANTS,
      COM_DAY_CQ_WCM_TAGS_DEFINEOBJECTSTAG,
      COM_DAY_CQ_WCM_TAGS_DEFINEOBJECTSTEI,
      COM_DAY_CQ_WCM_TAGS_TEXTTAG,
      COM_DAY_CQ_WCM_WEBSERVICESUPPORT_CONFIGURATIONCONSTANTS,
      COM_DAY_CQ_WCM_WEBSERVICESUPPORT_SERVICE,
      COM_DAY_CQ_WCM_WEBSERVICESUPPORT_SERVICECONSTANTS,
      COM_DAY_CQ_WCM_WORKFLOW_API_WCMWORKFLOWSERVICE,
      COM_DAY_CQ_WCM_WORKFLOW_PROCESS_CREATEVERSIONPROCESS,
      COM_DAY_CQ_WCM_WORKFLOW_PROCESS_REPLICATEPAGEPROCESS,
      COM_DAY_CQ_WORKFLOW_COLLECTION_RESOURCECOLLECTION,
      COM_DAY_CQ_WORKFLOW_EVENT_EXTERNALPROCESSPOLLINGEVENT,
      COM_DAY_CQ_WORKFLOW_EVENT_WORKFLOWEVENT,
      COM_DAY_CQ_WORKFLOW_EXEC_PARTICIPANTSTEPCHOOSER,
      COM_DAY_CQ_WORKFLOW_JOB_ABSOLUTETIMEOUTHANDLER,
      COM_DAY_CQ_WORKFLOW_JOB_EXTERNALPROCESSJOB,
      COM_DAY_CQ_WORKFLOW_JOB_TIMEOUTJOB,
      COM_DAY_CQ_WORKFLOW_JOB_WORKFLOWJOB,
      COM_DAY_CQ_WORKFLOW_MODEL_WORKFLOWMODELSERIALIZER,
      COM_DAY_CQ_WORKFLOW_MODEL_WORKFLOWNODE,
      COM_DAY_CRX_PACKAGING_JSONRESPONSE,
      COM_DAY_CRX_PACKAGING_PACKAGESHARE,
      COM_DAY_CRX_PACKAGING_GFX_DOWNLOADRESOURCE,
      COM_DAY_CRX_PACKAGING_GFX_IMAGERESOURCE,
      COM_DAY_CRX_SECURITY_TOKEN_TOKENCOOKIE,
      COM_DAY_DURBO_DURBOCONSTANTS,
      COM_DAY_IMAGE_COLORCURVE,
      COM_DAY_IMAGE_DITHER,
      COM_DAY_IMAGE_LAYER,
      COM_DAY_IMAGE_LINESTYLE,
      COM_DAY_IMAGE_FONT_ABSTRACTFONT,
      COM_DAY_IMAGEIO_PLUGINS_GIFIMAGEWRITERUTIL,
      COM_DAY_IO_DISK_DISKSPACEUTIL,
      COM_DAY_TEXT_AUTOFORMATTER,
      COM_DAY_TEXT_REPLACE,
      COM_DAY_TEXT_STRINGABBREVIATOR,
      COM_DAY_TEXT_TEXT,
      COM_DAY_TEXT_XMLCHAR,
      COM_DAY_UTIL_PROCESSRUNNER,
      COM_DAY_UTIL_TIMING,
      COM_DAY_UTIL_DIFF_CHANGELISTENER,
      COM_DAY_UTIL_DIFF_DIFFWRITER,
      COM_DAY_UTIL_DIFF_DOCUMENTSOURCE,
      COM_DAY_UTIL_DIFF_ELEMENTSFACTORY,
      COM_DAY_UTIL_DIFF_HUNK,
      COM_FASTERXML_JACKSON_ANNOTATION_JSONFORMAT,
      COM_FASTERXML_JACKSON_ANNOTATION_JSONPROPERTY,
      COM_FASTERXML_JACKSON_CORE_BASE64VARIANT,
      COM_FASTERXML_JACKSON_CORE_JSONFACTORY,
      COM_FASTERXML_JACKSON_CORE_JSONTOKENID,
      COM_FASTERXML_JACKSON_CORE_BASE_GENERATORBASE,
      COM_FASTERXML_JACKSON_CORE_FORMAT_DATAFORMATDETECTOR,
      COM_FASTERXML_JACKSON_CORE_IO_CHARACTERESCAPES,
      COM_FASTERXML_JACKSON_CORE_IO_NUMBERINPUT,
      COM_FASTERXML_JACKSON_CORE_JSON_JSONWRITECONTEXT,
      COM_FASTERXML_JACKSON_CORE_SYM_CHARSTONAMECANONICALIZER,
      COM_FASTERXML_JACKSON_CORE_UTIL_BUFFERRECYCLER,
      COM_FASTERXML_JACKSON_CORE_UTIL_MINIMALPRETTYPRINTER,
      COM_FASTERXML_JACKSON_DATABIND_DESER_DATAFORMATREADERS,
      COM_FASTERXML_JACKSON_DATABIND_DESER_STD_FROMSTRINGDESERIALIZER_STD,
      COM_FASTERXML_JACKSON_DATABIND_DESER_STD_STDKEYDESERIALIZER,
      COM_FASTERXML_JACKSON_DATABIND_JSONSCHEMA_JSONSERIALIZABLESCHEMA,
      COM_FASTERXML_JACKSON_DATABIND_UTIL_STDDATEFORMAT,
      COM_GOOGLE_ZXING_QRCODE_ENCODER_QRCODE,
      COM_SUN_MAIL_IAP_RESPONSE,
      COM_SUN_MAIL_IMAP_IMAPSTORE,
      COM_SUN_MAIL_IMAP_PROTOCOL_LISTINFO,
      COM_SUN_MAIL_SMTP_SMTPMESSAGE,
      ORG_APACHE_COCOON_XML_SAX_ATTRIBUTETYPES,
      ORG_APACHE_COMMONS_CODEC_CHARENCODING,
      ORG_APACHE_COMMONS_CODEC_BINARY_BASENCODEC,
      ORG_APACHE_COMMONS_CODEC_BINARY_HEX,
      ORG_APACHE_COMMONS_CODEC_DIGEST_MESSAGEDIGESTALGORITHMS,
      ORG_APACHE_COMMONS_CODEC_LANGUAGE_REFINEDSOUNDEX,
      ORG_APACHE_COMMONS_CODEC_LANGUAGE_SOUNDEX,
      ORG_APACHE_COMMONS_CODEC_LANGUAGE_BM_LANGUAGES,
      ORG_APACHE_COMMONS_CODEC_LANGUAGE_BM_RULE,
      ORG_APACHE_COMMONS_COLLECTIONS_REFERENCEMAP,
      ORG_APACHE_COMMONS_COLLECTIONS_COMPARATORS_FIXEDORDERCOMPARATOR,
      ORG_APACHE_COMMONS_COLLECTIONS_MAP_ABSTRACTREFERENCEMAP,
      ORG_APACHE_COMMONS_COLLECTIONS4_FUNCTORS_DEFAULTEQUATOR,
      ORG_APACHE_COMMONS_COLLECTIONS4_TRIE_KEYANALYZER,
      ORG_APACHE_COMMONS_COLLECTIONS4_TRIE_ANALYZER_STRINGKEYANALYZER,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ARCHIVEENTRY,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ARCHIVESTREAMFACTORY,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ENTRYSTREAMOFFSETS,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_AR_ARARCHIVEENTRY,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_AR_ARARCHIVEOUTPUTSTREAM,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ARJ_ARJARCHIVEENTRY_HOSTOS,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_CPIO_CPIOCONSTANTS,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_DUMP_DUMPARCHIVECONSTANTS,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_JAR_JARARCHIVEENTRY,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_TAR_TARARCHIVEENTRY,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_TAR_TARARCHIVEOUTPUTSTREAM,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_TAR_TARCONSTANTS,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_EXTRAFIELDUTILS_UNPARSEABLEEXTRAFIELD,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_GENERALPURPOSEBIT,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_RESOURCEALIGNMENTEXTRAFIELD,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_UNIXSTAT,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_X5455_EXTENDEDTIMESTAMP,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_ZIPARCHIVEENTRY,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_ZIPARCHIVEOUTPUTSTREAM,
      ORG_APACHE_COMMONS_COMPRESS_ARCHIVERS_ZIP_ZIPEXTRAFIELD,
      ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_COMPRESSORSTREAMFACTORY,
      ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_BZIP2_BZIP2COMPRESSORINPUTSTREAM,
      ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_BZIP2_BZIP2COMPRESSOROUTPUTSTREAM,
      ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_LZ77SUPPORT_PARAMETERS,
      ORG_APACHE_COMMONS_COMPRESS_COMPRESSORS_SNAPPY_SNAPPYCOMPRESSORINPUTSTREAM,
      ORG_APACHE_COMMONS_COMPRESS_UTILS_CHARSETNAMES,
      ORG_APACHE_COMMONS_EXEC_EXECUTEWATCHDOG,
      ORG_APACHE_COMMONS_EXEC_EXECUTOR,
      ORG_APACHE_COMMONS_EXEC_INPUTSTREAMPUMPER,
      ORG_APACHE_COMMONS_EXEC_UTIL_DEBUGUTILS,
      ORG_APACHE_COMMONS_FILEUPLOAD_FILEUPLOADBASE,
      ORG_APACHE_COMMONS_FILEUPLOAD_MULTIPARTSTREAM,
      ORG_APACHE_COMMONS_FILEUPLOAD_DISK_DISKFILEITEM,
      ORG_APACHE_COMMONS_FILEUPLOAD_DISK_DISKFILEITEMFACTORY,
      ORG_APACHE_COMMONS_HTTPCLIENT_HTTPSTATE,
      ORG_APACHE_COMMONS_IMAGING_IMAGINGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_COMMON_ITU_T4_T4ANDT6COMPRESSION,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_JPEG_JPEGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_JPEG_IPTC_IPTCCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_JPEG_SEGMENTS_APP14SEGMENT,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_PCX_PCXCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_PNG_PNGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_PNM_PNMIMAGEPARSER,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_PSD_PSDIMAGEPARSER,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_ADOBEPAGEMAKER6TAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_DCFTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_DNGTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_EXIFTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_GPSTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_MICROSOFTHDPHOTOTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_RFC2301TAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFF4TAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFDIRECTORYCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFEPTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_CONSTANTS_TIFFTAGCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_TAGINFOS_TAGINFO,
      ORG_APACHE_COMMONS_IMAGING_FORMATS_TIFF_WRITE_TIFFOUTPUTDIRECTORY,
      ORG_APACHE_COMMONS_IMAGING_ICC_ICCCONSTANTS,
      ORG_APACHE_COMMONS_IMAGING_PALETTE_PALETTEFACTORY,
      ORG_APACHE_COMMONS_IO_BYTEORDERMARK,
      ORG_APACHE_COMMONS_IO_FILENAMEUTILS,
      ORG_APACHE_COMMONS_IO_FILEUTILS,
      ORG_APACHE_COMMONS_IO_IOUTILS,
      ORG_APACHE_COMMONS_LANG_ARRAYUTILS,
      ORG_APACHE_COMMONS_LANG_CHARENCODING,
      ORG_APACHE_COMMONS_LANG_CHARUTILS,
      ORG_APACHE_COMMONS_LANG_CLASSUTILS,
      ORG_APACHE_COMMONS_LANG_STRINGUTILS,
      ORG_APACHE_COMMONS_LANG_TEXT_STRSUBSTITUTOR,
      ORG_APACHE_COMMONS_LANG_TIME_DATEUTILS,
      ORG_APACHE_COMMONS_LANG_TIME_DURATIONFORMATUTILS,
      ORG_APACHE_COMMONS_LANG_TIME_FASTDATEFORMAT,
      ORG_APACHE_COMMONS_LANG3_ARRAYUTILS,
      ORG_APACHE_COMMONS_LANG3_CHARENCODING,
      ORG_APACHE_COMMONS_LANG3_CHARUTILS,
      ORG_APACHE_COMMONS_LANG3_CLASSUTILS,
      ORG_APACHE_COMMONS_LANG3_STRINGUTILS,
      ORG_APACHE_COMMONS_LANG3_BUILDER_DIFFRESULT,
      ORG_APACHE_COMMONS_LANG3_CONCURRENT_ABSTRACTCIRCUITBREAKER,
      ORG_APACHE_COMMONS_LANG3_CONCURRENT_TIMEDSEMAPHORE,
      ORG_APACHE_COMMONS_LANG3_TEXT_STRSUBSTITUTOR,
      ORG_APACHE_COMMONS_LANG3_TIME_DATEUTILS,
      ORG_APACHE_COMMONS_LANG3_TIME_DURATIONFORMATUTILS,
      ORG_APACHE_COMMONS_LANG3_TIME_FASTDATEFORMAT,
      ORG_APACHE_COMMONS_LANG3_TIME_FASTDATEPRINTER,
      ORG_APACHE_COMMONS_LOGGING_LOGFACTORY,
      ORG_APACHE_COMMONS_LOGGING_IMPL_SIMPLELOG,
      ORG_APACHE_COMMONS_LOGGING_IMPL_SLF4JLOGFACTORY,
      ORG_APACHE_COMMONS_MAIL_BYTEARRAYDATASOURCE,
      ORG_APACHE_COMMONS_MAIL_EMAIL,
      ORG_APACHE_COMMONS_MAIL_EMAILCONSTANTS,
      ORG_APACHE_COMMONS_MAIL_HTMLEMAIL,
      ORG_APACHE_COMMONS_MAIL_IMAGEHTMLEMAIL,
      ORG_APACHE_COMMONS_MATH_ANALYSIS_INTERPOLATION_LOESSINTERPOLATOR,
      ORG_APACHE_COMMONS_MATH_ANALYSIS_INTERPOLATION_MICROSPHEREINTERPOLATOR,
      ORG_APACHE_COMMONS_MATH_ANALYSIS_SOLVERS_BRENTSOLVER,
      ORG_APACHE_COMMONS_MATH_DFP_DFP,
      ORG_APACHE_COMMONS_MATH_DFP_DFPFIELD,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_BETADISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_CAUCHYDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_CHISQUAREDDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_EXPONENTIALDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_FDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_GAMMADISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_NORMALDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_POISSONDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_TDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_DISTRIBUTION_WEIBULLDISTRIBUTIONIMPL,
      ORG_APACHE_COMMONS_MATH_ESTIMATION_ABSTRACTESTIMATOR,
      ORG_APACHE_COMMONS_MATH_LINEAR_BLOCKFIELDMATRIX,
      ORG_APACHE_COMMONS_MATH_LINEAR_BLOCKREALMATRIX,
      ORG_APACHE_COMMONS_MATH_LINEAR_CHOLESKYDECOMPOSITIONIMPL,
      ORG_APACHE_COMMONS_MATH_LINEAR_OPENMAPREALVECTOR,
      ORG_APACHE_COMMONS_MATH_ODE_EVENTS_EVENTHANDLER,
      ORG_APACHE_COMMONS_MATH_ODE_JACOBIANS_EVENTHANDLERWITHJACOBIANS,
      ORG_APACHE_COMMONS_MATH_OPTIMIZATION_DIRECT_POWELLOPTIMIZER,
      ORG_APACHE_COMMONS_MATH_OPTIMIZATION_GENERAL_ABSTRACTLEASTSQUARESOPTIMIZER,
      ORG_APACHE_COMMONS_MATH_OPTIMIZATION_GENERAL_ABSTRACTSCALARDIFFERENTIABLEOPTIMIZER,
      ORG_APACHE_COMMONS_MATH_OPTIMIZATION_LINEAR_ABSTRACTLINEAROPTIMIZER,
      ORG_APACHE_COMMONS_MATH_RANDOM_VALUESERVER,
      ORG_APACHE_COMMONS_MATH_SPECIAL_GAMMA,
      ORG_APACHE_COMMONS_MATH_STAT_DESCRIPTIVE_DESCRIPTIVESTATISTICS,
      ORG_APACHE_COMMONS_MATH_UTIL_FASTMATH,
      ORG_APACHE_COMMONS_MATH_UTIL_MATHUTILS,
      ORG_APACHE_COMMONS_MATH_UTIL_RESIZABLEDOUBLEARRAY,
      ORG_APACHE_FELIX_HTTP_WHITEBOARD_HTTPWHITEBOARDCONSTANTS,
      ORG_APACHE_FELIX_INVENTORY_INVENTORYPRINTER,
      ORG_APACHE_FELIX_JAAS_LOGINMODULEFACTORY,
      ORG_APACHE_FELIX_JAAS_BOOT_PROXYLOGINMODULE,
      ORG_APACHE_FELIX_METATYPE_AD,
      ORG_APACHE_FELIX_WEBCONSOLE_ABSTRACTWEBCONSOLEPLUGIN,
      ORG_APACHE_FELIX_WEBCONSOLE_CONFIGURATIONPRINTER,
      ORG_APACHE_FELIX_WEBCONSOLE_WEBCONSOLECONSTANTS,
      ORG_APACHE_FELIX_WEBCONSOLE_WEBCONSOLESECURITYPROVIDER2,
      ORG_APACHE_JACKRABBIT_JCRCONSTANTS,
      ORG_APACHE_JACKRABBIT_API_JACKRABBITNODETYPEMANAGER,
      ORG_APACHE_JACKRABBIT_API_JACKRABBITREPOSITORY,
      ORG_APACHE_JACKRABBIT_API_JACKRABBITSESSION,
      ORG_APACHE_JACKRABBIT_API_JMX_QUERYSTATMANAGERMBEAN,
      ORG_APACHE_JACKRABBIT_API_SECURITY_PRINCIPAL_PRINCIPALMANAGER,
      ORG_APACHE_JACKRABBIT_API_SECURITY_USER_USERMANAGER,
      ORG_APACHE_JACKRABBIT_COMMONS_GENERICREPOSITORYFACTORY,
      ORG_APACHE_JACKRABBIT_COMMONS_JCRUTILS,
      ORG_APACHE_JACKRABBIT_COMMONS_JNDIREPOSITORYFACTORY,
      ORG_APACHE_JACKRABBIT_COMMONS_NAMESPACEHELPER,
      ORG_APACHE_JACKRABBIT_COMMONS_CND_LEXER,
      ORG_APACHE_JACKRABBIT_COMMONS_JACKRABBIT_USER_AUTHORIZABLEQUERYMANAGER,
      ORG_APACHE_JACKRABBIT_COMMONS_PREDICATE_NTFILEPREDICATE,
      ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_ATOMFEEDCONSTANTS,
      ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_EVENTUTIL,
      ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_JCRREMOTINGCONSTANTS,
      ORG_APACHE_JACKRABBIT_COMMONS_WEBDAV_NODETYPECONSTANTS,
      ORG_APACHE_JACKRABBIT_COMMONS_XML_SERIALIZINGCONTENTHANDLER,
      ORG_APACHE_JACKRABBIT_CORE_CONFIG_DATASOURCECONFIG,
      ORG_APACHE_JACKRABBIT_CORE_DATA_FSBACKEND,
      ORG_APACHE_JACKRABBIT_CORE_DATA_DB_DBDATASTORE,
      ORG_APACHE_JACKRABBIT_CORE_FS_FILESYSTEM,
      ORG_APACHE_JACKRABBIT_CORE_UTIL_DB_CHECKSCHEMAOPERATION,
      ORG_APACHE_JACKRABBIT_CORE_UTIL_DB_DERBYCONNECTIONHELPER,
      ORG_APACHE_JACKRABBIT_OAK_API_COMMITFAILEDEXCEPTION,
      ORG_APACHE_JACKRABBIT_OAK_API_QUERYENGINE,
      ORG_APACHE_JACKRABBIT_OAK_API_ROOT,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_CACHESTATSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_CHECKPOINTMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_CONSOLIDATEDCACHESTATSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_CONSOLIDATEDDATASTORECACHESTATSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_COPYONWRITESTOREMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_DESCRIPTION,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_FILESTOREBACKUPRESTOREMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_IMPACT,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_INDEXERMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_INDEXSTATSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_NAME,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_PERSISTENTCACHESTATSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_QUERYENGINESETTINGSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_REPOSITORYMANAGEMENTMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_REPOSITORYSTATSMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_API_JMX_SESSIONMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_PLUGINS_TREE_TREECONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_BACKGROUNDOBSERVER,
      ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_BACKGROUNDOBSERVERMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_COMMITCONTEXT,
      ORG_APACHE_JACKRABBIT_OAK_SPI_COMMIT_COMMITINFO,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_COMPOSITECONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_REGISTRATIONCONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_ABSTRACTLOGINMODULE,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_AUTHENTICATIONCONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_EXTERNAL_BASIC_DEFAULTSYNCCONTEXT,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_TOKEN_TOKENCONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_TOKEN_TOKENCONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_TOKEN_TOKENPROVIDER,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_AUTHORIZATIONCONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_ACCESSCONTROL_ACCESSCONTROLCONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_PERMISSION_PERMISSIONCONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_PERMISSION_PERMISSIONS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRINCIPAL_EVERYONEPRINCIPAL,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRINCIPAL_PRINCIPALCONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRIVILEGE_PRIVILEGECONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_PRIVILEGE_PRIVILEGECONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_USERCONFIGURATION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_USERCONSTANTS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_ACTION_ACCESSCONTROLACTION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_ACTION_PASSWORDVALIDATIONACTION,
      ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_UTIL_PASSWORDUTIL,
      ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_CONFLICTANNOTATINGREBASEDIFF,
      ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_MOVEDETECTOR,
      ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_NODESTOREPROVIDER,
      ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_REVISIONGC,
      ORG_APACHE_JACKRABBIT_OAK_SPI_STATE_REVISIONGCMBEAN,
      ORG_APACHE_JACKRABBIT_OAK_SPI_WHITEBOARD_WHITEBOARDUTILS,
      ORG_APACHE_JACKRABBIT_OAK_SPI_XML_IMPORTBEHAVIOR,
      ORG_APACHE_JACKRABBIT_OAK_SPI_XML_PROTECTEDITEMIMPORTER,
      ORG_APACHE_JACKRABBIT_SPI_NAME,
      ORG_APACHE_JACKRABBIT_SPI_PATH,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_ITEMINFOCACHEIMPL,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_NODETYPE_NODETYPEDEFDIFF,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_LOCATIONSTEPQUERYNODE,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_PROPERTYFUNCTIONQUERYNODE,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_QUERYCONSTANTS,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_QUERYNODE,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_SQL_JCRSQLPARSERCONSTANTS,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_SQL_JCRSQLPARSERTREECONSTANTS,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_SQL_SIMPLECHARSTREAM,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_XPATH_SIMPLECHARSTREAM,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_XPATH_XPATHCONSTANTS,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_QUERY_XPATH_XPATHTREECONSTANTS,
      ORG_APACHE_JACKRABBIT_SPI_COMMONS_VALUE_ABSTRACTQVALUEFACTORY,
      ORG_APACHE_JACKRABBIT_UTIL_XMLCHAR,
      ORG_APACHE_JACKRABBIT_VAULT_FS_API_REPOSITORYADDRESS,
      ORG_APACHE_JACKRABBIT_VAULT_FS_API_VAULTFSCONFIG,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_ABSTRACTCONFIG,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_ABSTRACTVAULTFSCONFIG,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_CREDENTIALSCONFIG,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_DEFAULTWORKSPACEFILTER,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_METAINF,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_SIMPLECREDENTIALSCONFIG,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_VAULTAUTHCONFIG,
      ORG_APACHE_JACKRABBIT_VAULT_FS_CONFIG_VAULTSETTINGS,
      ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_JCRPACKAGE,
      ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_JCRPACKAGEDEFINITION,
      ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_PACKAGEID,
      ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_PACKAGEPROPERTIES,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_CONSTANTS,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_JCRCONSTANTS,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_MIMETYPES,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_LINESEPARATOR,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_METHOD,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_OUTPUTFORMAT_DEFAULTS,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_SERIALIZE_OUTPUTFORMAT_DTD,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_XERCES_DOM_DOMMESSAGEFORMATTER,
      ORG_APACHE_JACKRABBIT_VAULT_UTIL_XML_XERCES_UTIL_XMLCHAR,
      ORG_APACHE_JACKRABBIT_WEBDAV_DAVCOMPLIANCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_DAVCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_DAVEXCEPTION,
      ORG_APACHE_JACKRABBIT_WEBDAV_DAVMETHODS,
      ORG_APACHE_JACKRABBIT_WEBDAV_DAVRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_DAVSERVLETRESPONSE,
      ORG_APACHE_JACKRABBIT_WEBDAV_BIND_BINDCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_HEADER_OVERWRITEHEADER,
      ORG_APACHE_JACKRABBIT_WEBDAV_OBSERVATION_OBSERVATIONCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_OBSERVATION_OBSERVATIONRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_ORDERING_ORDERINGCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_ORDERING_ORDERINGRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_PROPERTY_RESOURCETYPE,
      ORG_APACHE_JACKRABBIT_WEBDAV_SEARCH_SEARCHCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_SEARCH_SEARCHINFO,
      ORG_APACHE_JACKRABBIT_WEBDAV_SEARCH_SEARCHRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_ACLRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_PRINCIPAL,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_PRIVILEGE,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_ACLPRINCIPALREPORT,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_PRINCIPALMATCHREPORT,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_PRINCIPALSEARCHREPORT,
      ORG_APACHE_JACKRABBIT_WEBDAV_SECURITY_REPORT_SEARCHABLEPROPERTYREPORT,
      ORG_APACHE_JACKRABBIT_WEBDAV_SERVER_ABSTRACTWEBDAVSERVLET,
      ORG_APACHE_JACKRABBIT_WEBDAV_TRANSACTION_TRANSACTIONCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_TRANSACTION_TRANSACTIONRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_TRANSACTION_TXACTIVELOCK,
      ORG_APACHE_JACKRABBIT_WEBDAV_UTIL_CSRFUTIL,
      ORG_APACHE_JACKRABBIT_WEBDAV_UTIL_HTTPDATEFORMAT,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_DELTAVCONSTANTS,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_DELTAVRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_LABELINFO,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_UPDATEINFO,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONABLERESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONCONTROLLEDRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONHISTORYRESOURCE,
      ORG_APACHE_JACKRABBIT_WEBDAV_VERSION_VERSIONRESOURCE,
      ORG_APACHE_LOG4J_LEVEL,
      ORG_APACHE_LOG4J_NDC,
      ORG_APACHE_LOG4J_PRIORITY,
      ORG_APACHE_LOG4J_HELPERS_LOGLOG,
      ORG_APACHE_LOG4J_SPI_CONFIGURATOR,
      ORG_APACHE_OLTU_JOSE_JWS_JWSCONSTANTS,
      ORG_APACHE_OLTU_JOSE_JWS_IO_JWSHEADERWRITER,
      ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH,
      ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_CONTENTTYPE,
      ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_HEADERTYPE,
      ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_HTTPMETHOD,
      ORG_APACHE_OLTU_OAUTH2_COMMON_OAUTH_WWWAUTHHEADER,
      ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR,
      ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR_CODERESPONSE,
      ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR_RESOURCERESPONSE,
      ORG_APACHE_OLTU_OAUTH2_COMMON_ERROR_OAUTHERROR_TOKENRESPONSE,
      ORG_APACHE_OLTU_OAUTH2_COMMON_UTILS_OAUTHUTILS,
      ORG_APACHE_OLTU_OAUTH2_JWT_IO_JWTCLAIMSSETWRITER,
      ORG_APACHE_OLTU_OAUTH2_JWT_IO_JWTHEADERWRITER,
      ORG_APACHE_SLING_API_SLINGCONSTANTS,
      ORG_APACHE_SLING_API_ADAPTER_ADAPTERFACTORY,
      ORG_APACHE_SLING_API_ADAPTER_ADAPTERMANAGER,
      ORG_APACHE_SLING_API_AUTH_AUTHENTICATOR,
      ORG_APACHE_SLING_API_REQUEST_REQUESTDISPATCHEROPTIONS,
      ORG_APACHE_SLING_API_REQUEST_SLINGREQUESTLISTENER,
      ORG_APACHE_SLING_API_RESOURCE_QUERIABLERESOURCEPROVIDER,
      ORG_APACHE_SLING_API_RESOURCE_RESOURCE,
      ORG_APACHE_SLING_API_RESOURCE_RESOURCEMETADATA,
      ORG_APACHE_SLING_API_RESOURCE_RESOURCEPROVIDER,
      ORG_APACHE_SLING_API_RESOURCE_RESOURCEPROVIDERFACTORY,
      ORG_APACHE_SLING_API_RESOURCE_RESOURCERESOLVER,
      ORG_APACHE_SLING_API_RESOURCE_RESOURCERESOLVERFACTORY,
      ORG_APACHE_SLING_API_RESOURCE_OBSERVATION_RESOURCECHANGELISTENER,
      ORG_APACHE_SLING_API_RESOURCE_PATH_PATH,
      ORG_APACHE_SLING_API_SCRIPTING_SLINGBINDINGS,
      ORG_APACHE_SLING_API_SCRIPTING_SLINGSCRIPTCONSTANTS,
      ORG_APACHE_SLING_API_SECURITY_RESOURCEACCESSSECURITY,
      ORG_APACHE_SLING_API_SERVLETS_HTMLRESPONSE,
      ORG_APACHE_SLING_API_SERVLETS_HTTPCONSTANTS,
      ORG_APACHE_SLING_API_SERVLETS_SERVLETRESOLVERCONSTANTS,
      ORG_APACHE_SLING_API_WRAPPERS_SLINGREQUESTPATHS,
      ORG_APACHE_SLING_AUTH_CORE_AUTHCONSTANTS,
      ORG_APACHE_SLING_AUTH_CORE_AUTHENTICATIONSUPPORT,
      ORG_APACHE_SLING_AUTH_CORE_SPI_ABSTRACTAUTHENTICATIONFORMSERVLET,
      ORG_APACHE_SLING_AUTH_CORE_SPI_AUTHENTICATIONHANDLER,
      ORG_APACHE_SLING_AUTH_CORE_SPI_AUTHENTICATIONINFO,
      ORG_APACHE_SLING_AUTH_CORE_SPI_AUTHENTICATIONINFOPOSTPROCESSOR,
      ORG_APACHE_SLING_COMMONS_COMPILER_OPTIONS,
      ORG_APACHE_SLING_COMMONS_JSON_HTTP_HTTP,
      ORG_APACHE_SLING_COMMONS_JSON_IO_JSONRENDERER_OPTIONS,
      ORG_APACHE_SLING_COMMONS_JSON_JCR_JSONITEMWRITER,
      ORG_APACHE_SLING_COMMONS_LOG_LOGBACK_WEBCONSOLE_LOGPANEL,
      ORG_APACHE_SLING_COMMONS_METRICS_GAUGE,
      ORG_APACHE_SLING_COMMONS_OSGI_BSNRENAMER,
      ORG_APACHE_SLING_COMMONS_OSGI_BUNDLEVERSION_BUNDLEVERSIONINFO,
      ORG_APACHE_SLING_COMMONS_SCHEDULER_SCHEDULER,
      ORG_APACHE_SLING_COMMONS_THREADS_MODIFIABLETHREADPOOLCONFIG,
      ORG_APACHE_SLING_COMMONS_THREADS_THREADPOOLMANAGER,
      ORG_APACHE_SLING_DISCOVERY_INSTANCEDESCRIPTION,
      ORG_APACHE_SLING_DISCOVERY_PROPERTYPROVIDER,
      ORG_APACHE_SLING_DISCOVERY_COMMONS_PROVIDERS_SPI_BASE_DISCOVERYLITEDESCRIPTOR,
      ORG_APACHE_SLING_DISTRIBUTION_EVENT_DISTRIBUTIONEVENTPROPERTIES,
      ORG_APACHE_SLING_DISTRIBUTION_EVENT_DISTRIBUTIONEVENTTOPICS,
      ORG_APACHE_SLING_DISTRIBUTION_UTIL_DISTRIBUTIONJCRUTILS,
      ORG_APACHE_SLING_ENGINE_ENGINECONSTANTS,
      ORG_APACHE_SLING_ENGINE_REQUESTLOG,
      ORG_APACHE_SLING_ENGINE_AUTH_AUTHENTICATIONHANDLER,
      ORG_APACHE_SLING_EVENT_DEA_DEACONSTANTS,
      ORG_APACHE_SLING_HAPI_HAPIUTIL,
      ORG_APACHE_SLING_HC_API_HEALTHCHECK,
      ORG_APACHE_SLING_HC_UTIL_HEALTHCHECKFILTER,
      ORG_APACHE_SLING_HC_UTIL_SIMPLECONSTRAINTCHECKER,
      ORG_APACHE_SLING_I18N_RESOURCEBUNDLEPROVIDER,
      ORG_APACHE_SLING_INSTALLER_API_INSTALLABLERESOURCE,
      ORG_APACHE_SLING_INSTALLER_API_RESOURCECHANGELISTENER,
      ORG_APACHE_SLING_INSTALLER_API_UPDATEHANDLER,
      ORG_APACHE_SLING_INSTALLER_API_TASKS_INSTALLTASK,
      ORG_APACHE_SLING_INSTALLER_API_TASKS_INSTALLTASKFACTORY,
      ORG_APACHE_SLING_INSTALLER_API_TASKS_RESOURCETRANSFORMER,
      ORG_APACHE_SLING_INSTALLER_API_TASKS_TASKRESOURCE,
      ORG_APACHE_SLING_INSTALLER_FACTORIES_CONFIGURATION_CONFIGURATIONCONSTANTS,
      ORG_APACHE_SLING_JCR_BASE_UTIL_REPOSITORYACCESSOR,
      ORG_APACHE_SLING_JCR_CONTENTLOADER_CONTENTREADER,
      ORG_APACHE_SLING_JCR_CONTENTLOADER_CONTENTTYPEUTIL,
      ORG_APACHE_SLING_JCR_REGISTRATION_ABSTRACTREGISTRATIONSUPPORT,
      ORG_APACHE_SLING_JCR_RESOURCE_API_JCRRESOURCECONSTANTS,
      ORG_APACHE_SLING_PROVISIONING_MODEL_FEATURETYPES,
      ORG_APACHE_SLING_PROVISIONING_MODEL_MODELCONSTANTS,
      ORG_APACHE_SLING_PROVISIONING_MODEL_IO_MODELARCHIVEWRITER,
      ORG_APACHE_SLING_RESOURCE_COLLECTION_RESOURCECOLLECTION,
      ORG_APACHE_SLING_RESOURCEACCESSSECURITY_RESOURCEACCESSGATE,
      ORG_APACHE_SLING_RESOURCEMERGER_SPI_MERGEDRESOURCEPICKER,
      ORG_APACHE_SLING_RESOURCEMERGER_SPI_MERGEDRESOURCEPICKER2,
      ORG_APACHE_SLING_REWRITER_PROCESSINGCOMPONENTCONFIGURATION,
      ORG_APACHE_SLING_SCRIPTING_API_BINDINGSVALUESPROVIDER,
      ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_DEFINEOBJECTSTAG,
      ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_DEFINEOBJECTSTEI,
      ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_TEI_ADAPTTOTEI,
      ORG_APACHE_SLING_SCRIPTING_JSP_TAGLIB_TEI_GETPROPERTYTEI,
      ORG_APACHE_SLING_SCRIPTING_SIGHTLY_COMPILER_RUNTIMEFUNCTION,
      ORG_APACHE_SLING_SCRIPTING_SIGHTLY_EXTENSION_RUNTIMEEXTENSION,
      ORG_APACHE_SLING_SCRIPTING_SIGHTLY_RENDER_ABSTRACTRUNTIMEOBJECTMODEL,
      ORG_APACHE_SLING_SERVICEUSERMAPPING_SERVICEUSERMAPPED,
      ORG_APACHE_SLING_SERVLETS_POST_ABSTRACTPOSTRESPONSE,
      ORG_APACHE_SLING_SERVLETS_POST_JSONRESPONSE,
      ORG_APACHE_SLING_SERVLETS_POST_POSTOPERATION,
      ORG_APACHE_SLING_SERVLETS_POST_SLINGPOSTCONSTANTS,
      ORG_APACHE_SLING_SERVLETS_POST_SLINGPOSTOPERATION,
      ORG_APACHE_SLING_SETTINGS_SLINGSETTINGSSERVICE,
      ORG_APACHE_SLING_SPI_RESOURCE_PROVIDER_PROVIDERCONTEXT,
      ORG_APACHE_SLING_SPI_RESOURCE_PROVIDER_RESOURCEPROVIDER,
      ORG_APACHE_SLING_TENANT_TENANT,
      ORG_APACHE_SLING_XSS_JSONUTIL,
      ORG_APACHE_TIKA_CONFIG_PARAMFIELD,
      ORG_APACHE_TIKA_EMBEDDER_EXTERNALEMBEDDER,
      ORG_APACHE_TIKA_LANGUAGE_LANGUAGEPROFILE,
      ORG_APACHE_TIKA_METADATA_ACCESSPERMISSIONS,
      ORG_APACHE_TIKA_METADATA_CLIMATEFORCAST,
      ORG_APACHE_TIKA_METADATA_CREATIVECOMMONS,
      ORG_APACHE_TIKA_METADATA_DATABASE,
      ORG_APACHE_TIKA_METADATA_DUBLINCORE,
      ORG_APACHE_TIKA_METADATA_HTML,
      ORG_APACHE_TIKA_METADATA_HTTPHEADERS,
      ORG_APACHE_TIKA_METADATA_IPTC,
      ORG_APACHE_TIKA_METADATA_MESSAGE,
      ORG_APACHE_TIKA_METADATA_METADATA,
      ORG_APACHE_TIKA_METADATA_MSOFFICE,
      ORG_APACHE_TIKA_METADATA_OFFICE,
      ORG_APACHE_TIKA_METADATA_OFFICEOPENXMLCORE,
      ORG_APACHE_TIKA_METADATA_OFFICEOPENXMLEXTENDED,
      ORG_APACHE_TIKA_METADATA_PDF,
      ORG_APACHE_TIKA_METADATA_PHOTOSHOP,
      ORG_APACHE_TIKA_METADATA_QUATTROPRO,
      ORG_APACHE_TIKA_METADATA_RTFMETADATA,
      ORG_APACHE_TIKA_METADATA_TIKACOREPROPERTIES,
      ORG_APACHE_TIKA_METADATA_TIKAMETADATAKEYS,
      ORG_APACHE_TIKA_METADATA_TIKAMIMEKEYS,
      ORG_APACHE_TIKA_METADATA_WORDPERFECT,
      ORG_APACHE_TIKA_METADATA_XMP,
      ORG_APACHE_TIKA_METADATA_XMPIDQ,
      ORG_APACHE_TIKA_METADATA_XMPMM,
      ORG_APACHE_TIKA_METADATA_XMPRIGHTS,
      ORG_APACHE_TIKA_MIME_MIMETYPES,
      ORG_APACHE_TIKA_MIME_MIMETYPESFACTORY,
      ORG_APACHE_TIKA_MIME_MIMETYPESREADERMETKEYS,
      ORG_APACHE_TIKA_PARSER_CHM_CORE_CHMCOMMONS,
      ORG_APACHE_TIKA_PARSER_CHM_CORE_CHMCONSTANTS,
      ORG_APACHE_TIKA_PARSER_CRYPTO_TSDPARSER,
      ORG_APACHE_TIKA_PARSER_ENVI_ENVIHEADERPARSER,
      ORG_APACHE_TIKA_PARSER_EXECUTABLE_MACHINEMETADATA,
      ORG_APACHE_TIKA_PARSER_EXTERNAL_EXTERNALPARSER,
      ORG_APACHE_TIKA_PARSER_EXTERNAL_EXTERNALPARSERSCONFIGREADERMETKEYS,
      ORG_APACHE_TIKA_PARSER_GEOINFO_GEOGRAPHICINFORMATIONPARSER,
      ORG_APACHE_TIKA_PARSER_GRIB_GRIBPARSER,
      ORG_APACHE_TIKA_PARSER_IMAGE_ICNSPARSER,
      ORG_APACHE_TIKA_PARSER_IWORK_IWORKPACKAGEPARSER,
      ORG_APACHE_TIKA_PARSER_IWORK_IWANA_IWORK13PACKAGEPARSER,
      ORG_APACHE_TIKA_PARSER_MAT_MATPARSER,
      ORG_APACHE_TIKA_PARSER_MBOX_MBOXPARSER,
      ORG_APACHE_TIKA_PARSER_MICROSOFT_JACKCESSPARSER,
      ORG_APACHE_TIKA_PARSER_MICROSOFT_OOXML_OOXMLWORDANDPOWERPOINTTEXTHANDLER,
      ORG_APACHE_TIKA_PARSER_MP3_AUDIOFRAME,
      ORG_APACHE_TIKA_PARSER_NER_NAMEDENTITYPARSER,
      ORG_APACHE_TIKA_PARSER_NER_NERECOGNISER,
      ORG_APACHE_TIKA_PARSER_NER_CORENLP_CORENLPNERECOGNISER,
      ORG_APACHE_TIKA_PARSER_NER_MITIE_MITIENERECOGNISER,
      ORG_APACHE_TIKA_PARSER_NER_OPENNLP_OPENNLPNERECOGNISER,
      ORG_APACHE_TIKA_PARSER_NER_REGEX_REGEXNERECOGNISER,
      ORG_APACHE_TIKA_PARSER_ODF_OPENDOCUMENTCONTENTPARSER,
      ORG_APACHE_TIKA_PARSER_PDF_PDFPARSER,
      ORG_APACHE_TIKA_PARSER_PRT_PRTPARSER,
      ORG_APACHE_TIKA_PARSER_RECOGNITION_OBJECTRECOGNITIONPARSER,
      ORG_APACHE_TIKA_PARSER_RTF_LISTDESCRIPTOR,
      ORG_APACHE_TIKA_PARSER_SENTIMENT_SENTIMENTANALYSISPARSER,
      ORG_APACHE_TIKA_SAX_STANDARDSEXTRACTINGCONTENTHANDLER,
      ORG_APACHE_TIKA_SAX_XHTMLCONTENTHANDLER,
      ORG_APACHE_TIKA_SAX_XMPCONTENTHANDLER,
      ORG_JODA_TIME_DATETIMECONSTANTS,
      ORG_JODA_TIME_MONTHDAY,
      ORG_JODA_TIME_MUTABLEDATETIME,
      ORG_JODA_TIME_TIMEOFDAY,
      ORG_JODA_TIME_YEARMONTH,
      ORG_JODA_TIME_YEARMONTHDAY,
      ORG_JODA_TIME_CHRONO_BUDDHISTCHRONOLOGY,
      ORG_JODA_TIME_CHRONO_COPTICCHRONOLOGY,
      ORG_JODA_TIME_CHRONO_ETHIOPICCHRONOLOGY,
      ORG_JODA_TIME_CHRONO_ISLAMICCHRONOLOGY,
      ORG_KOHSUKE_RNGOM_RNGPARSER_AST_BUILDER_GRAMMARSECTION,
      ORG_KOHSUKE_RNGOM_RNGPARSER_PARSE_COMPACT_UCODE_UCODEESC_CHARSTREAM,
      ORG_OSGI_JMX_JMXCONSTANTS,
      ORG_OSGI_JMX_FRAMEWORK_BUNDLESTATEMBEAN,
      ORG_OSGI_JMX_FRAMEWORK_FRAMEWORKMBEAN,
      ORG_OSGI_JMX_FRAMEWORK_PACKAGESTATEMBEAN,
      ORG_OSGI_JMX_FRAMEWORK_SERVICESTATEMBEAN,
      ORG_OSGI_JMX_FRAMEWORK_WIRING_BUNDLEWIRINGSTATEMBEAN,
      ORG_OSGI_JMX_SERVICE_CM_CONFIGURATIONADMINMBEAN,
      ORG_OSGI_JMX_SERVICE_PERMISSIONADMIN_PERMISSIONADMINMBEAN,
      ORG_OSGI_JMX_SERVICE_PROVISIONING_PROVISIONINGSERVICEMBEAN,
      ORG_OSGI_JMX_SERVICE_USERADMIN_USERADMINMBEAN,
      ORG_OSGI_SERVICE_COMPONENT_COMPONENTCONSTANTS,
      ORG_OSGI_SERVICE_COMPONENT_RUNTIME_DTO_COMPONENTCONFIGURATIONDTO,
      ORG_SLF4J_LOGGER,
      ORG_SLF4J_MARKER,
      ORG_SLF4J_EVENT_EVENTCONSTANTS,
      ORG_SLF4J_SPI_LOCATIONAWARELOGGER
  )

  /**
   * List of too "common" or vague constants that are highly likely to be
   * used in some unrelated context.
   */
  val EXLUSIONS: Set<String> = setOf(
//      // com.day.cq.dam.api.DamConstants
//      "/apps",
//      "/libs",
//      "/var/dam",
//      "/content/dam",
//      "renditions",
//      "metadata",
//      "modifier",
//      "original",
//      "currentOriginal",
//      "subassets",
//      "image/png",
//      "onTime",
//      "offTime",
//      "dc:title",
//      "dam",
//      "asset",
//      "externalSystem",
//      "license",
//      "rendition",
//      "subasset",
//      "assetExpired",
//      "assetExpiring",
//      "processingProfile",
//      "metadataProfile",
//      "videoProfile",
//      "imageProfile",
//      "folderThumbnail",
//      "downloadUrl",
//      "approved",
//      "pending",
//      "rejected",
//      "pages",
//
//      // com.day.cq.wcm.api.NameConstants
//      "dialog",
//      "icon.png",
//      "thumbnail.png",
//      "ranking",
//      "sitePath",
//      "params",
//      "virtual",
//      "className",
//      "deleted",
//      "deletedBy",
//      "propertyName",
//      "accept",
//      "groups",
//      "parameters",
//      "shortTitle",
//      "pageTitle",
//      "navTitle",
//      "hideInNav",
//      "onTime",
//      "offTime",
//      "vanityUrl",
//
//      // com.day.cq.tagging.TagConstants
//      "nirvana",
//      ":",
//      "/",
//      " / ",
//      "default",
//      "default:",
//
//      // com.day.cq.replication.ReplicationStatus
//      "cq:lastPublished",
//      "cq:lastPublishedBy",
//
//      // org.apache.jackrabbit.vault.packaging.JcrPackage
//      "application/zip",
//
//      // org.apache.jackrabbit.vault.packaging.JcrPackageDefinition
//      "lastUnpacked",
//      "lastUnpackedBy",
//      "version",
//      "lastWrapped",
//      "lastWrappedBy",
//      "buildCount",
//      "name",
//      "group",
//      "requiresRoot",
//      "requiresRestart",
//      "dependencies",
//      "subPackages",
//      "lastUnwrapped",
//      "lastUnwrappedBy",
//      "acHandling",
//      "cndPattern",
//      "filter",
//      "root",
//      "mode",
//      "rules",
//      "type",
//      "pattern",
//
//      // com.adobe.granite.workflow.event.WorkflowEvent
//      "TimeStamp",
//      "User",
//      "Delagatee",
//      "JobFailed",
//
//      // org.apache.sling.api.SlingConstants
//      "sling",
//      "path",
//      "userid",
//
//      // org.osgi.framework.Constants
//      "processor",
//      "osname",
//      "osversion",
//      "language",
//      "singleton",
//      "always",
//      "never",
//      "version",
//      "resolution",
//      "mandatory",
//      "optional",
//      "uses",
//      "include",
//      "exclude",
//      "visibility",
//      "private",
//      "extension",
//      "framework",
//      "lazy",
//      "osgi",
//      "onFirstInit",
//      "boot",
//      "ext",
//      "app",
//      "framework",
//      "objectClass",
//
//      // org.apache.sling.engine.EngineConstants
//      "filter.scope",
//      "COMPONENT",
//      "ERROR",
//      "INCLUDE",
//      "FORWARD",
//      "REQUEST"
  )

}
