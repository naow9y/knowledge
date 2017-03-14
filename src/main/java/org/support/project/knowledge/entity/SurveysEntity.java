package org.support.project.knowledge.entity;

import java.util.ArrayList;
import java.util.List;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenSurveysEntity;


/**
 * アンケート
 */
@DI(instance = Instance.Prototype)
public class SurveysEntity extends GenSurveysEntity {

    private List<SurveyItemsEntity> items = new ArrayList<SurveyItemsEntity>();
    
    
    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static SurveysEntity get() {
        return Container.getComp(SurveysEntity.class);
    }

    /**
     * Constructor.
     */
    public SurveysEntity() {
        super();
    }

    /**
     * Constructor
     * @param knowledgeId ナレッジID
     */

    public SurveysEntity(Long knowledgeId) {
        super( knowledgeId);
    }

    /**
     * @return the items
     */
    public List<SurveyItemsEntity> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<SurveyItemsEntity> items) {
        this.items = items;
    }

}
