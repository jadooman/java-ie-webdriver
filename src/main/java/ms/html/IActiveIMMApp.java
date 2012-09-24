package ms.html  ;

import com4j.*;

@IID("{08C0E040-62D1-11D1-9326-0060B067B86E}")
public interface IActiveIMMApp extends Com4jObject {
  // Methods:
  /**
   * @param hWnd Mandatory int parameter.
   * @param hIME Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(3)
  int associateContext(
    int hWnd,
    int hIME);


      /**
       * @return  Returns a value of type int
       */

      @VTID(6)
      int createContext();


      /**
       * @param hIME Mandatory int parameter.
       */

      @VTID(7)
      void destroyContext(
        int hIME);


      /**
       * @param hKL Mandatory java.nio.Buffer parameter.
       * @param szReading Mandatory java.lang.String parameter.
       * @param dwStyle Mandatory int parameter.
       * @param szRegister Mandatory java.lang.String parameter.
       * @param pData Mandatory java.nio.Buffer parameter.
       * @return  Returns a value of type ms.html.IEnumRegisterWordA
       */

      @VTID(8)
      ms.html.IEnumRegisterWordA enumRegisterWordA(
        java.nio.Buffer hKL,
        @MarshalAs(NativeType.CSTR) java.lang.String szReading,
        int dwStyle,
        @MarshalAs(NativeType.CSTR) java.lang.String szRegister,
        java.nio.Buffer pData);


      /**
       * @param hKL Mandatory java.nio.Buffer parameter.
       * @param szReading Mandatory java.lang.String parameter.
       * @param dwStyle Mandatory int parameter.
       * @param szRegister Mandatory java.lang.String parameter.
       * @param pData Mandatory java.nio.Buffer parameter.
       * @return  Returns a value of type ms.html.IEnumRegisterWordW
       */

      @VTID(9)
      ms.html.IEnumRegisterWordW enumRegisterWordW(
        java.nio.Buffer hKL,
        @MarshalAs(NativeType.Unicode) java.lang.String szReading,
        int dwStyle,
        @MarshalAs(NativeType.Unicode) java.lang.String szRegister,
        java.nio.Buffer pData);


      /**
       * @param hKL Mandatory java.nio.Buffer parameter.
       * @param hIMC Mandatory int parameter.
       * @param uEscape Mandatory int parameter.
       * @param pData Mandatory java.nio.Buffer parameter.
       * @return  Returns a value of type long
       */

      @VTID(10)
      long escapeA(
        java.nio.Buffer hKL,
        int hIMC,
        int uEscape,
        java.nio.Buffer pData);


      /**
       * @param hKL Mandatory java.nio.Buffer parameter.
       * @param hIMC Mandatory int parameter.
       * @param uEscape Mandatory int parameter.
       * @param pData Mandatory java.nio.Buffer parameter.
       * @return  Returns a value of type long
       */

      @VTID(11)
      long escapeW(
        java.nio.Buffer hKL,
        int hIMC,
        int uEscape,
        java.nio.Buffer pData);


          /**
           * @param hIMC Mandatory int parameter.
           * @param pdwListSize Mandatory Holder<Integer> parameter.
           * @param pdwBufLen Mandatory Holder<Integer> parameter.
           */

          @VTID(14)
          void getCandidateListCountA(
            int hIMC,
            Holder<Integer> pdwListSize,
            Holder<Integer> pdwBufLen);


          /**
           * @param hIMC Mandatory int parameter.
           * @param pdwListSize Mandatory Holder<Integer> parameter.
           * @param pdwBufLen Mandatory Holder<Integer> parameter.
           */

          @VTID(15)
          void getCandidateListCountW(
            int hIMC,
            Holder<Integer> pdwListSize,
            Holder<Integer> pdwBufLen);


          /**
           * @param hIMC Mandatory int parameter.
           * @param dwIndex Mandatory int parameter.
           * @param dwBufLen Mandatory int parameter.
           * @param plCopied Mandatory Holder<Integer> parameter.
           * @param pBuf Mandatory java.nio.Buffer parameter.
           */

          @VTID(19)
          void getCompositionStringA(
            int hIMC,
            int dwIndex,
            int dwBufLen,
            Holder<Integer> plCopied,
            java.nio.Buffer pBuf);


          /**
           * @param hIMC Mandatory int parameter.
           * @param dwIndex Mandatory int parameter.
           * @param dwBufLen Mandatory int parameter.
           * @param plCopied Mandatory Holder<Integer> parameter.
           * @param pBuf Mandatory java.nio.Buffer parameter.
           */

          @VTID(20)
          void getCompositionStringW(
            int hIMC,
            int dwIndex,
            int dwBufLen,
            Holder<Integer> plCopied,
            java.nio.Buffer pBuf);


          /**
           * @param hWnd Mandatory int parameter.
           * @return  Returns a value of type int
           */

          @VTID(22)
          int getContext(
            int hWnd);


              /**
               * @param hIMC Mandatory int parameter.
               * @param pfdwConversion Mandatory Holder<Integer> parameter.
               * @param pfdwSentence Mandatory Holder<Integer> parameter.
               */

              @VTID(25)
              void getConversionStatus(
                int hIMC,
                Holder<Integer> pfdwConversion,
                Holder<Integer> pfdwSentence);


              /**
               * @param hWnd Mandatory int parameter.
               * @return  Returns a value of type int
               */

              @VTID(26)
              int getDefaultIMEWnd(
                int hWnd);


              /**
               * @param hKL Mandatory java.nio.Buffer parameter.
               * @param uBufLen Mandatory int parameter.
               * @param szDescription Mandatory java.lang.String parameter.
               * @param puCopied Mandatory Holder<Integer> parameter.
               */

              @VTID(27)
              void getDescriptionA(
                java.nio.Buffer hKL,
                int uBufLen,
                @MarshalAs(NativeType.CSTR) java.lang.String szDescription,
                Holder<Integer> puCopied);


              /**
               * @param hKL Mandatory java.nio.Buffer parameter.
               * @param uBufLen Mandatory int parameter.
               * @param szDescription Mandatory java.lang.String parameter.
               * @param puCopied Mandatory Holder<Integer> parameter.
               */

              @VTID(28)
              void getDescriptionW(
                java.nio.Buffer hKL,
                int uBufLen,
                @MarshalAs(NativeType.Unicode) java.lang.String szDescription,
                Holder<Integer> puCopied);


              /**
               * @param hIMC Mandatory int parameter.
               * @param dwIndex Mandatory int parameter.
               * @param dwBufLen Mandatory int parameter.
               * @param pBuf Mandatory java.lang.String parameter.
               * @param pdwResult Mandatory Holder<Integer> parameter.
               */

              @VTID(29)
              void getGuideLineA(
                int hIMC,
                int dwIndex,
                int dwBufLen,
                @MarshalAs(NativeType.CSTR) java.lang.String pBuf,
                Holder<Integer> pdwResult);


              /**
               * @param hIMC Mandatory int parameter.
               * @param dwIndex Mandatory int parameter.
               * @param dwBufLen Mandatory int parameter.
               * @param pBuf Mandatory java.lang.String parameter.
               * @param pdwResult Mandatory Holder<Integer> parameter.
               */

              @VTID(30)
              void getGuideLineW(
                int hIMC,
                int dwIndex,
                int dwBufLen,
                @MarshalAs(NativeType.Unicode) java.lang.String pBuf,
                Holder<Integer> pdwResult);


              /**
               * @param hKL Mandatory java.nio.Buffer parameter.
               * @param uBufLen Mandatory int parameter.
               * @param szFileName Mandatory java.lang.String parameter.
               * @param puCopied Mandatory Holder<Integer> parameter.
               */

              @VTID(31)
              void getIMEFileNameA(
                java.nio.Buffer hKL,
                int uBufLen,
                @MarshalAs(NativeType.CSTR) java.lang.String szFileName,
                Holder<Integer> puCopied);


              /**
               * @param hKL Mandatory java.nio.Buffer parameter.
               * @param uBufLen Mandatory int parameter.
               * @param szFileName Mandatory java.lang.String parameter.
               * @param puCopied Mandatory Holder<Integer> parameter.
               */

              @VTID(32)
              void getIMEFileNameW(
                java.nio.Buffer hKL,
                int uBufLen,
                @MarshalAs(NativeType.Unicode) java.lang.String szFileName,
                Holder<Integer> puCopied);


              /**
               * @param hIMC Mandatory int parameter.
               */

              @VTID(33)
              void getOpenStatus(
                int hIMC);


              /**
               * @param hKL Mandatory java.nio.Buffer parameter.
               * @param fdwIndex Mandatory int parameter.
               * @return  Returns a value of type int
               */

              @VTID(34)
              int getProperty(
                java.nio.Buffer hKL,
                int fdwIndex);


                  /**
                   * @param hWnd Mandatory int parameter.
                   * @return  Returns a value of type int
                   */

                  @VTID(38)
                  int getVirtualKey(
                    int hWnd);


                  /**
                   * @param szIMEFileName Mandatory java.lang.String parameter.
                   * @param szLayoutText Mandatory java.lang.String parameter.
                   * @return  Returns a value of type java.nio.Buffer
                   */

                  @VTID(39)
                  java.nio.Buffer installIMEA(
                    @MarshalAs(NativeType.CSTR) java.lang.String szIMEFileName,
                    @MarshalAs(NativeType.CSTR) java.lang.String szLayoutText);


                  /**
                   * @param szIMEFileName Mandatory java.lang.String parameter.
                   * @param szLayoutText Mandatory java.lang.String parameter.
                   * @return  Returns a value of type java.nio.Buffer
                   */

                  @VTID(40)
                  java.nio.Buffer installIMEW(
                    @MarshalAs(NativeType.Unicode) java.lang.String szIMEFileName,
                    @MarshalAs(NativeType.Unicode) java.lang.String szLayoutText);


                  /**
                   * @param hKL Mandatory java.nio.Buffer parameter.
                   */

                  @VTID(41)
                  void isIME(
                    java.nio.Buffer hKL);


                  /**
                   * @param hWndIME Mandatory int parameter.
                   * @param msg Mandatory int parameter.
                   * @param wParam Mandatory long parameter.
                   * @param lParam Mandatory long parameter.
                   */

                  @VTID(42)
                  void isUIMessageA(
                    int hWndIME,
                    int msg,
                    long wParam,
                    long lParam);


                  /**
                   * @param hWndIME Mandatory int parameter.
                   * @param msg Mandatory int parameter.
                   * @param wParam Mandatory long parameter.
                   * @param lParam Mandatory long parameter.
                   */

                  @VTID(43)
                  void isUIMessageW(
                    int hWndIME,
                    int msg,
                    long wParam,
                    long lParam);


                  /**
                   * @param hIMC Mandatory int parameter.
                   * @param dwAction Mandatory int parameter.
                   * @param dwIndex Mandatory int parameter.
                   * @param dwValue Mandatory int parameter.
                   */

                  @VTID(44)
                  void notifyIME(
                    int hIMC,
                    int dwAction,
                    int dwIndex,
                    int dwValue);


                  /**
                   * @param hKL Mandatory java.nio.Buffer parameter.
                   * @param szReading Mandatory java.lang.String parameter.
                   * @param dwStyle Mandatory int parameter.
                   * @param szRegister Mandatory java.lang.String parameter.
                   */

                  @VTID(45)
                  void registerWordA(
                    java.nio.Buffer hKL,
                    @MarshalAs(NativeType.CSTR) java.lang.String szReading,
                    int dwStyle,
                    @MarshalAs(NativeType.CSTR) java.lang.String szRegister);


                  /**
                   * @param hKL Mandatory java.nio.Buffer parameter.
                   * @param szReading Mandatory java.lang.String parameter.
                   * @param dwStyle Mandatory int parameter.
                   * @param szRegister Mandatory java.lang.String parameter.
                   */

                  @VTID(46)
                  void registerWordW(
                    java.nio.Buffer hKL,
                    @MarshalAs(NativeType.Unicode) java.lang.String szReading,
                    int dwStyle,
                    @MarshalAs(NativeType.Unicode) java.lang.String szRegister);


                  /**
                   * @param hWnd Mandatory int parameter.
                   * @param hIMC Mandatory int parameter.
                   */

                  @VTID(47)
                  void releaseContext(
                    int hWnd,
                    int hIMC);


                        /**
                         * @param hIMC Mandatory int parameter.
                         * @param dwIndex Mandatory int parameter.
                         * @param pComp Mandatory java.nio.Buffer parameter.
                         * @param dwCompLen Mandatory int parameter.
                         * @param pRead Mandatory java.nio.Buffer parameter.
                         * @param dwReadLen Mandatory int parameter.
                         */

                        @VTID(51)
                        void setCompositionStringA(
                          int hIMC,
                          int dwIndex,
                          java.nio.Buffer pComp,
                          int dwCompLen,
                          java.nio.Buffer pRead,
                          int dwReadLen);


                        /**
                         * @param hIMC Mandatory int parameter.
                         * @param dwIndex Mandatory int parameter.
                         * @param pComp Mandatory java.nio.Buffer parameter.
                         * @param dwCompLen Mandatory int parameter.
                         * @param pRead Mandatory java.nio.Buffer parameter.
                         * @param dwReadLen Mandatory int parameter.
                         */

                        @VTID(52)
                        void setCompositionStringW(
                          int hIMC,
                          int dwIndex,
                          java.nio.Buffer pComp,
                          int dwCompLen,
                          java.nio.Buffer pRead,
                          int dwReadLen);


                          /**
                           * @param hIMC Mandatory int parameter.
                           * @param fdwConversion Mandatory int parameter.
                           * @param fdwSentence Mandatory int parameter.
                           */

                          @VTID(54)
                          void setConversionStatus(
                            int hIMC,
                            int fdwConversion,
                            int fdwSentence);


                          /**
                           * @param hIMC Mandatory int parameter.
                           * @param fOpen Mandatory int parameter.
                           */

                          @VTID(55)
                          void setOpenStatus(
                            int hIMC,
                            int fOpen);


                            /**
                             * @param hWnd Mandatory int parameter.
                             * @param dwHotKeyID Mandatory int parameter.
                             */

                            @VTID(57)
                            void simulateHotKey(
                              int hWnd,
                              int dwHotKeyID);


                            /**
                             * @param hKL Mandatory java.nio.Buffer parameter.
                             * @param szReading Mandatory java.lang.String parameter.
                             * @param dwStyle Mandatory int parameter.
                             * @param szUnregister Mandatory java.lang.String parameter.
                             */

                            @VTID(58)
                            void unregisterWordA(
                              java.nio.Buffer hKL,
                              @MarshalAs(NativeType.CSTR) java.lang.String szReading,
                              int dwStyle,
                              @MarshalAs(NativeType.CSTR) java.lang.String szUnregister);


                            /**
                             * @param hKL Mandatory java.nio.Buffer parameter.
                             * @param szReading Mandatory java.lang.String parameter.
                             * @param dwStyle Mandatory int parameter.
                             * @param szUnregister Mandatory java.lang.String parameter.
                             */

                            @VTID(59)
                            void unregisterWordW(
                              java.nio.Buffer hKL,
                              @MarshalAs(NativeType.Unicode) java.lang.String szReading,
                              int dwStyle,
                              @MarshalAs(NativeType.Unicode) java.lang.String szUnregister);


                            /**
                             * @param fRestoreLayout Mandatory int parameter.
                             */

                            @VTID(60)
                            void activate(
                              int fRestoreLayout);


                            /**
                             */

                            @VTID(61)
                            void deactivate();


                            /**
                             * @param hWnd Mandatory int parameter.
                             * @param msg Mandatory int parameter.
                             * @param wParam Mandatory long parameter.
                             * @param lParam Mandatory long parameter.
                             * @return  Returns a value of type long
                             */

                            @VTID(62)
                            long onDefWindowProc(
                              int hWnd,
                              int msg,
                              long wParam,
                              long lParam);


                            /**
                             * @param aaClassList Mandatory Holder<Short> parameter.
                             * @param uSize Mandatory int parameter.
                             */

                            @VTID(63)
                            void filterClientWindows(
                              Holder<Short> aaClassList,
                              int uSize);


                            /**
                             * @param hKL Mandatory java.nio.Buffer parameter.
                             * @return  Returns a value of type int
                             */

                            @VTID(64)
                            int getCodePageA(
                              java.nio.Buffer hKL);


                            /**
                             * @param hKL Mandatory java.nio.Buffer parameter.
                             * @return  Returns a value of type short
                             */

                            @VTID(65)
                            short getLangId(
                              java.nio.Buffer hKL);


                            /**
                             * @param hWnd Mandatory int parameter.
                             * @param hIMC Mandatory int parameter.
                             * @param dwFlags Mandatory int parameter.
                             */

                            @VTID(66)
                            void associateContextEx(
                              int hWnd,
                              int hIMC,
                              int dwFlags);


                            /**
                             * @param idThread Mandatory int parameter.
                             */

                            @VTID(67)
                            void disableIME(
                              int idThread);


                                /**
                                 * @param idThread Mandatory int parameter.
                                 * @return  Returns a value of type ms.html.IEnumInputContext
                                 */

                                @VTID(70)
                                ms.html.IEnumInputContext enumInputContext(
                                  int idThread);


                                // Properties:
                              }
