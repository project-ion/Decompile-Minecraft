/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnb
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   private atr a;
/*    8:     */   private atr b;
/*    9:     */   private atr c;
/*   10:     */   private atr d;
/*   11:     */   
/*   12:     */   public bnb() {}
/*   13:     */   
/*   14:     */   public bnb(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   15:     */   {
/*   16:1735 */     super(parambnk, paramInt);
/*   17:     */     
/*   18:1737 */     this.m = paramej;
/*   19:1738 */     this.l = parambjb;
/*   20:     */     
/*   21:1740 */     this.a = a(paramRandom);
/*   22:1741 */     this.b = a(paramRandom);
/*   23:1742 */     this.c = a(paramRandom);
/*   24:1743 */     this.d = a(paramRandom);
/*   25:     */   }
/*   26:     */   
/*   27:     */   protected void a(fn paramfn)
/*   28:     */   {
/*   29:1748 */     super.a(paramfn);
/*   30:1749 */     paramfn.a("CA", atr.c.b(this.a));
/*   31:1750 */     paramfn.a("CB", atr.c.b(this.b));
/*   32:1751 */     paramfn.a("CC", atr.c.b(this.c));
/*   33:1752 */     paramfn.a("CD", atr.c.b(this.d));
/*   34:     */   }
/*   35:     */   
/*   36:     */   protected void b(fn paramfn)
/*   37:     */   {
/*   38:1757 */     super.b(paramfn);
/*   39:1758 */     this.a = atr.c(paramfn.f("CA"));
/*   40:1759 */     this.b = atr.c(paramfn.f("CB"));
/*   41:1760 */     this.c = atr.c(paramfn.f("CC"));
/*   42:1761 */     this.d = atr.c(paramfn.f("CD"));
/*   43:     */   }
/*   44:     */   
/*   45:     */   private atr a(Random paramRandom)
/*   46:     */   {
/*   47:1765 */     switch (paramRandom.nextInt(5))
/*   48:     */     {
/*   49:     */     default: 
/*   50:1767 */       return aty.aj;
/*   51:     */     case 0: 
/*   52:1769 */       return aty.cb;
/*   53:     */     }
/*   54:1771 */     return aty.cc;
/*   55:     */   }
/*   56:     */   
/*   57:     */   public static bnb a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   58:     */   {
/*   59:1776 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 13, 4, 9, paramej);
/*   60:1778 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   61:1779 */       return null;
/*   62:     */     }
/*   63:1782 */     return new bnb(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   64:     */   }
/*   65:     */   
/*   66:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   67:     */   {
/*   68:1787 */     if (this.h < 0)
/*   69:     */     {
/*   70:1788 */       this.h = b(paramaqu, parambjb);
/*   71:1789 */       if (this.h < 0) {
/*   72:1790 */         return true;
/*   73:     */       }
/*   74:1792 */       this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*   75:     */     }
/*   76:1796 */     a(paramaqu, parambjb, 0, 1, 0, 12, 4, 8, aty.a.P(), aty.a.P(), false);
/*   77:     */     
/*   78:     */ 
/*   79:1799 */     a(paramaqu, parambjb, 1, 0, 1, 2, 0, 7, aty.ak.P(), aty.ak.P(), false);
/*   80:1800 */     a(paramaqu, parambjb, 4, 0, 1, 5, 0, 7, aty.ak.P(), aty.ak.P(), false);
/*   81:1801 */     a(paramaqu, parambjb, 7, 0, 1, 8, 0, 7, aty.ak.P(), aty.ak.P(), false);
/*   82:1802 */     a(paramaqu, parambjb, 10, 0, 1, 11, 0, 7, aty.ak.P(), aty.ak.P(), false);
/*   83:     */     
/*   84:1804 */     a(paramaqu, parambjb, 0, 0, 0, 0, 0, 8, aty.r.P(), aty.r.P(), false);
/*   85:1805 */     a(paramaqu, parambjb, 6, 0, 0, 6, 0, 8, aty.r.P(), aty.r.P(), false);
/*   86:1806 */     a(paramaqu, parambjb, 12, 0, 0, 12, 0, 8, aty.r.P(), aty.r.P(), false);
/*   87:1807 */     a(paramaqu, parambjb, 1, 0, 0, 11, 0, 0, aty.r.P(), aty.r.P(), false);
/*   88:1808 */     a(paramaqu, parambjb, 1, 0, 8, 11, 0, 8, aty.r.P(), aty.r.P(), false);
/*   89:     */     
/*   90:1810 */     a(paramaqu, parambjb, 3, 0, 1, 3, 0, 7, aty.j.P(), aty.j.P(), false);
/*   91:1811 */     a(paramaqu, parambjb, 9, 0, 1, 9, 0, 7, aty.j.P(), aty.j.P(), false);
/*   92:1813 */     for (int i = 1; i <= 7; i++)
/*   93:     */     {
/*   94:1814 */       a(paramaqu, this.a.a(uv.a(paramRandom, 2, 7)), 1, 1, i, parambjb);
/*   95:1815 */       a(paramaqu, this.a.a(uv.a(paramRandom, 2, 7)), 2, 1, i, parambjb);
/*   96:1816 */       a(paramaqu, this.b.a(uv.a(paramRandom, 2, 7)), 4, 1, i, parambjb);
/*   97:1817 */       a(paramaqu, this.b.a(uv.a(paramRandom, 2, 7)), 5, 1, i, parambjb);
/*   98:1818 */       a(paramaqu, this.c.a(uv.a(paramRandom, 2, 7)), 7, 1, i, parambjb);
/*   99:1819 */       a(paramaqu, this.c.a(uv.a(paramRandom, 2, 7)), 8, 1, i, parambjb);
/*  100:1820 */       a(paramaqu, this.d.a(uv.a(paramRandom, 2, 7)), 10, 1, i, parambjb);
/*  101:1821 */       a(paramaqu, this.d.a(uv.a(paramRandom, 2, 7)), 11, 1, i, parambjb);
/*  102:     */     }
/*  103:1824 */     for (i = 0; i < 9; i++) {
/*  104:1825 */       for (int j = 0; j < 13; j++)
/*  105:     */       {
/*  106:1826 */         b(paramaqu, j, 4, i, parambjb);
/*  107:1827 */         b(paramaqu, aty.d.P(), j, -1, i, parambjb);
/*  108:     */       }
/*  109:     */     }
/*  110:1831 */     return true;
/*  111:     */   }
/*  112:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bnb
 * JD-Core Version:    0.7.0.1
 */