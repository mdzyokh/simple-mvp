package com.tinmegali.androidmvp.main;

import android.view.View;

import com.tinmegali.androidmvp.common.mvp.ActivityView;
import com.tinmegali.androidmvp.common.mvp.ModelOps;
import com.tinmegali.androidmvp.common.mvp.PresenterOps;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 25/02/16.
 * Project: AndroidMVP
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 * Based on <a href="https://github.com/douglascraigschmidt/POSA-15/tree/master/ex/AcronymExpander/src/vandy/mooc">
 * framework MVP</a> developed by
 * <a href="https://github.com/douglascraigschmidt">
 * Dr. Douglas Schmidth</a>
 * ---------------------------------------------------
 *
 * Interface guarda-chuva, que armazena todas operações disponíveis
 * para realizar comunicações entre os diferentes layer
 * do Model View Presenter
 *
 * <strong>Utilizando</strong>
 * <ul>
 *     <li>
 *         Crie as interfaces de comunicação entre os módulos View, Presenter e Model
 *          <ol>
 *              <li>
 *             interface <code>RequiredViewOps</code> fornece métodos para <code>Presenter</code>
 *         comunicar com <code>View</code>. É necessário extender <code>ActivityView</code>
 *              </li>
 *              <li>
 *                  interface <code>ProvidedPresenterOps</code> fornece operações oferecidas
 *                  ao layer View para comunicação com Presenter.
 *                  É preciso extender <code>PresenterOps<RequiredViewOps></code>
 *              </li>
 *              <li>
 *                  interface <code>RequiredPresenterOps</code> operações oferecidas
 *                  pelo layer Presenter para comunicações com Model
 *              </li>
 *              <li>
 *                  interface <code>ProvidedModelOps</code> operações oferecidos pelo
 *                  layer Model para comunicações com Presenter.
 *                  É preciso extender <code>ModelOps<RequiredPresenterOps></code>
 *              </li>
 *          </ol>
 *     </li>
 *     <li>
 *         Crie a classe <code>Model</code> extendendo <code>GenericModel<RequiredPresenterOps></code>
 *         e implementando <code>ProvidedModelOps</code>
 *         ex: {@link com.tinmegali.androidmvp.main.model.MainModel}
 *     </li>
 *     <li>
 *         Crie a classe <code>Presenter</code> extendendo <code>GenericPresenter</code>,
 *         implementando <code>RequiredPresenterOps</code> e <code>ProvidedPresenterOps</code>.
 *         exemplo: {@link com.tinmegali.androidmvp.main.presenter.MainPresenter}
 *     </li>
 *     <li>
 *         Crie a classe <code>View</code> GenericMVPActivity ou GenericMVPFragment e
 *         implementando <code>RequiredViewOps</code>
 *         Exemplo: {@link com.tinmegali.androidmvp.main.view.MainActivity}
 *     </li>.
 * </ul>
 *
 */


public interface MVP_MainActivity {

    /**
     * Métodos obrigatórios em View, disponíveis para Presenter
     *      Presenter -> View
     */
    interface RequiredViewOps extends ActivityView {
    }


    /**
     * operações oferecidas ao layer View para comunicação com Presenter
     *      View -> Presenter
     */
    interface ProvidedPresenterOps extends PresenterOps<RequiredViewOps> {
    }

    /**
     * operações oferecidas pelo layer Presenter para comunicações com Model
     *      Model -> Presenter
     */
    interface RequiredPresenterOps {
    }

    /**
     * operações oferecidos pelo layer Model para comunicações com Presenter
     *      Presenter -> Model
     */
    interface ProvidedModelOps extends ModelOps<RequiredPresenterOps>{
    }

}
