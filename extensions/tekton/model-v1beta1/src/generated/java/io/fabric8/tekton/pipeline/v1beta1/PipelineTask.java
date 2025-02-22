
package io.fabric8.tekton.pipeline.v1beta1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.Duration;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "conditions",
    "matrix",
    "name",
    "params",
    "resources",
    "retries",
    "runAfter",
    "taskRef",
    "taskSpec",
    "timeout",
    "when",
    "workspaces"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
public class PipelineTask implements KubernetesResource
{

    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PipelineTaskCondition> conditions = new ArrayList<PipelineTaskCondition>();
    @JsonProperty("matrix")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Param> matrix = new ArrayList<Param>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("params")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Param> params = new ArrayList<Param>();
    @JsonProperty("resources")
    private PipelineTaskResources resources;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("runAfter")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> runAfter = new ArrayList<String>();
    @JsonProperty("taskRef")
    private TaskRef taskRef;
    @JsonProperty("taskSpec")
    private EmbeddedTask taskSpec;
    @JsonProperty("timeout")
    private Duration timeout;
    @JsonProperty("when")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<WhenExpression> when = new ArrayList<WhenExpression>();
    @JsonProperty("workspaces")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<WorkspacePipelineTaskBinding> workspaces = new ArrayList<WorkspacePipelineTaskBinding>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PipelineTask() {
    }

    /**
     * 
     * @param retries
     * @param taskRef
     * @param name
     * @param resources
     * @param runAfter
     * @param workspaces
     * @param conditions
     * @param matrix
     * @param params
     * @param taskSpec
     * @param when
     * @param timeout
     */
    public PipelineTask(List<PipelineTaskCondition> conditions, List<Param> matrix, String name, List<Param> params, PipelineTaskResources resources, Integer retries, List<String> runAfter, TaskRef taskRef, EmbeddedTask taskSpec, Duration timeout, List<WhenExpression> when, List<WorkspacePipelineTaskBinding> workspaces) {
        super();
        this.conditions = conditions;
        this.matrix = matrix;
        this.name = name;
        this.params = params;
        this.resources = resources;
        this.retries = retries;
        this.runAfter = runAfter;
        this.taskRef = taskRef;
        this.taskSpec = taskSpec;
        this.timeout = timeout;
        this.when = when;
        this.workspaces = workspaces;
    }

    @JsonProperty("conditions")
    public List<PipelineTaskCondition> getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(List<PipelineTaskCondition> conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("matrix")
    public List<Param> getMatrix() {
        return matrix;
    }

    @JsonProperty("matrix")
    public void setMatrix(List<Param> matrix) {
        this.matrix = matrix;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("params")
    public List<Param> getParams() {
        return params;
    }

    @JsonProperty("params")
    public void setParams(List<Param> params) {
        this.params = params;
    }

    @JsonProperty("resources")
    public PipelineTaskResources getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(PipelineTaskResources resources) {
        this.resources = resources;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    @JsonProperty("runAfter")
    public List<String> getRunAfter() {
        return runAfter;
    }

    @JsonProperty("runAfter")
    public void setRunAfter(List<String> runAfter) {
        this.runAfter = runAfter;
    }

    @JsonProperty("taskRef")
    public TaskRef getTaskRef() {
        return taskRef;
    }

    @JsonProperty("taskRef")
    public void setTaskRef(TaskRef taskRef) {
        this.taskRef = taskRef;
    }

    @JsonProperty("taskSpec")
    public EmbeddedTask getTaskSpec() {
        return taskSpec;
    }

    @JsonProperty("taskSpec")
    public void setTaskSpec(EmbeddedTask taskSpec) {
        this.taskSpec = taskSpec;
    }

    @JsonProperty("timeout")
    public Duration getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

    @JsonProperty("when")
    public List<WhenExpression> getWhen() {
        return when;
    }

    @JsonProperty("when")
    public void setWhen(List<WhenExpression> when) {
        this.when = when;
    }

    @JsonProperty("workspaces")
    public List<WorkspacePipelineTaskBinding> getWorkspaces() {
        return workspaces;
    }

    @JsonProperty("workspaces")
    public void setWorkspaces(List<WorkspacePipelineTaskBinding> workspaces) {
        this.workspaces = workspaces;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
